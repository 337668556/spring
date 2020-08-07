package com.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Massage {
    private  int id;
    private boolean success;
    private String username;
    private  String password;
    private List<String> somelist;
    private Set<String> someSet;
    private Map<String,Object> someMap;
    private Properties someProps;
    private List<String> langs;

    public Massage() {
    }

    public Massage(int id, boolean success, String username, String password, List<String> somelist, Set<String> someSet, Map<String, Object> someMap, Properties someProps, List<String> langs) {
        this.id = id;
        this.success = success;
        this.username = username;
        this.password = password;
        this.somelist = somelist;
        this.someSet = someSet;
        this.someMap = someMap;
        this.someProps = someProps;
        this.langs = langs;
    }

    @Override
    public String toString() {
        return "Massage{" +
                "id=" + id +
                ", success=" + success +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", somelist=" + somelist +
                ", someSet=" + someSet +
                ", someMap=" + someMap +
                ", someProps=" + someProps +
                ", langs=" + langs +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getSomelist() {
        return somelist;
    }

    public void setSomelist(List<String> somelist) {
        this.somelist = somelist;
    }

    public Set<String> getSomeSet() {
        return someSet;
    }

    public void setSomeSet(Set<String> someSet) {
        this.someSet = someSet;
    }

    public Map<String, Object> getSomeMap() {
        return someMap;
    }

    public void setSomeMap(Map<String, Object> someMap) {
        this.someMap = someMap;
    }

    public Properties getSomeProps() {
        return someProps;
    }

    public void setSomeProps(Properties someProps) {
        this.someProps = someProps;
    }

    public List<String> getLangs() {
        return langs;
    }

    public void setLangs(List<String> langs) {
        this.langs = langs;
    }
}
