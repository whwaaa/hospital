package com.kkb.pojo;

public class Menu {
    private Integer m_id;

    private String m_url;

    private String m_name;

    private Integer m_state;

    @Override
    public String toString() {
        return "Menu{" +
                "m_id=" + m_id +
                ", m_url='" + m_url + '\'' +
                ", m_name='" + m_name + '\'' +
                ", m_state=" + m_state +
                '}';
    }

    public Menu(){
        m_state = 0;
    }

    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getM_url() {
        return m_url;
    }

    public void setM_url(String m_url) {
        this.m_url = m_url == null ? null : m_url.trim();
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name == null ? null : m_name.trim();
    }

    public Integer getM_state() {
        return m_state;
    }

    public void setM_state(Integer m_state) {
        this.m_state = m_state;
    }
}