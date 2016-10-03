package com.topview.www.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.topview.www.entity.MapBean;
import com.topview.www.entity.User;
import com.topview.www.entity.Users;


/*
ע�ͣ�Annotation������ javax.ws.rs.* �ж��壬�� JAX-RS (JSR 311) �淶��һ���֡� 
@Path��������Դ�� URI���������ĸ�����������ɣ���Դ��ʶ�������� http://localhost:8080/RESTful/rest/hello�� 
@GET������ζ�����·���������Ӧ HTTP GET ������ 
@Produces���Դ��ı���ʽ������Ӧ���� MIME ���͡�

@Context�� ʹ�ø�ע��ע�������Ķ��󣬱��� Request��Response��UriInfo��ServletContext �ȡ� 
@Path("{contact}")������ @Path ע�ͣ����·�� ��/contacts�� ����γ�����Դ�� URI�� 
@PathParam("contact")����ע�ͽ�����ע�뷽��������·�����ڱ����о�����ϵ�� id���������õ�ע���� @FormParam��@QueryParam �ȡ� 
@Produces����Ӧ֧�ֶ�� MIME ���͡��ڱ�������һ��ʾ���У�APPLICATION/XML ����Ĭ�ϵ� MIME ���͡�
*/
/**
* <b>function:</b> CXF RESTful���WebService
* @author hoojo
* @createDate 2012-7-20 ����01:23:04
* @file RESTSampleSource.java
* @package com.hoo.service
* @project CXFWebService
* @blog http://blog.csdn.net/IBM_hoojo
* @email hoojo_@126.com
* @version 1.0
*/


@Path(value = "/sample")
public class RESTSampleSource implements RESTSample {
	
	@Context
    private UriInfo uriInfo;
    
    @Context
    private Request request;
 
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String doGet() {
        return "this is get rest request";
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/request/{param}")
    public String doRequest(@PathParam("param") String param, 
            @Context HttpServletRequest servletRequest, @Context HttpServletResponse servletResponse) {
        System.out.println(servletRequest);
        System.out.println(servletResponse);
        System.out.println(servletRequest.getParameter("param"));
        System.out.println(servletRequest.getContentType());
        System.out.println(servletResponse.getCharacterEncoding());
        System.out.println(servletResponse.getContentType());
        return "success";
    }
    
    @GET
    @Path("/bean/{id}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public User getBean(@PathParam("id") int id) {
        System.out.println("####getBean#####");
        System.out.println("id:" + id);
        System.out.println("Method:" + request.getMethod());
        System.out.println("uri:" + uriInfo.getPath());
        System.out.println(uriInfo.getPathParameters());
        
        User user = new User();
        user.setId(id);
        user.setName("JojO");
        return user;
    }
    
    @GET
    @Path("/list")
    @Produces({ MediaType.APPLICATION_JSON})
    public Users getList() {
        System.out.println("####getList#####");
        System.out.println("Method:" + request.getMethod());
        System.out.println("uri:" + uriInfo.getPath());
        System.out.println(uriInfo.getPathParameters());
        
        List<User> list = new ArrayList<User>();
        User user = null;
        for (int i = 0; i < 4;i ++) {
            user = new User();
            user.setId(i);
            user.setName("JojO-" + i);
            list.add(user);
        }
        Users users = new Users();
        users.setUsers(list);
        //JSONArray jsonArray = JSONArray.fromObject(users);  
        //System.out.println(jsonArray.toString());
        return users;
    }
    
    @GET
    @Path("/map")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public MapBean getMap() {
        System.out.println("####getMap#####");
        System.out.println("Method:" + request.getMethod());
        System.out.println("uri:" + uriInfo.getPath());
        System.out.println(uriInfo.getPathParameters());
        
        Map<String, User> map = new HashMap<String, User>();
        User user = null;
        for (int i = 0; i < 4;i ++) {
            user = new User();
            user.setId(i);
            user.setName("JojO-" + i);
            map.put("key-" + i, user);
        }
        MapBean bean = new MapBean();
        bean.setMap(map);
        return bean;
    }    
    
    /*
        @Consumes�������÷���ʹ�� HTML FORM�� 
        @FormParam��ע��÷����� HTML ����ȷ���ı����롣 
        @Response.created(uri).build()�� �����µ� URI �����´�������ϵ�ˣ�/contacts/{id}����������Ӧ���루201/created����
        ������ʹ�� http://localhost:8080/Jersey/rest/contacts/<id> ��������ϵ��
     */
    @POST
    @Path("/postData")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public User postData(User user) throws IOException {
        System.out.println(user);
        user.setName("jojo##12321321");
        return user;
    } 
    
    @PUT
    @Path("/putData/{id}")
    @Produces({ MediaType.APPLICATION_XML })
    public User putData(@PathParam("id") int id, User user) {
        System.out.println("#####putData#####");
        System.out.println(user);
        user.setId(id);
        user.setAddress("hoojo#gz");
        user.setEmail("hoojo_@126.com");
        user.setName("hoojo");
        System.out.println(user);
        return user;
    }
    
    @DELETE
    @Path("/removeData/{id}")
    public void deleteData(@PathParam("id") int id) {
        System.out.println("#######deleteData#######" + id);
    }

}
