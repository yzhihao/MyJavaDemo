package com.topview.www.entity;

import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <b>function:</b> MapBean ��װMap����Ԫ��
 */

@XmlRootElement
public class MapBean {
	
	private Map<String, User> map;

    //@XmlElement(type = User.class)
    public Map<String, User> getMap() {
        return map;
    }
    public void setMap(Map<String, User> map) {
        this.map = map;
    }
}
