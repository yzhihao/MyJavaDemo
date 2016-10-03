package com.topview.www.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

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
public interface RESTSample {
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String doGet();
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/request/{param}")
    public String doRequest(@PathParam("param") String param, 
            @Context HttpServletRequest servletRequest, @Context HttpServletResponse servletResponse);
    
    @GET
    @Path("/bean/{id}")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public User getBean(@PathParam("id") int id);
    
    @GET
    @Path("/list")
    @Produces({ MediaType.APPLICATION_JSON})
    public Users getList();
    
    @GET
    @Path("/map")
    @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
    public MapBean getMap();
    
    /*
        @Consumes�������÷���ʹ�� HTML FORM�� 
        @FormParam��ע��÷����� HTML ����ȷ���ı����롣 
        @Response.created(uri).build()�� �����µ� URI �����´�������ϵ�ˣ�/contacts/{id}����������Ӧ���루201/created����
        ������ʹ�� http://localhost:8080/Jersey/rest/contacts/<id> ��������ϵ��
     */
    @POST
    @Path("/postData")
    public User postData(User user) throws IOException;
    
    @PUT
    @Path("/putData/{id}")
    @Consumes(MediaType.APPLICATION_XML)
    public User putData(@PathParam("id") int id, User user);
    
    @DELETE
    @Path("/removeData/{id}")
    public void deleteData(@PathParam("id") int id);
}
