package {{package_name}}.support.enums;

import static {{package_name}}.support.utils.GetVariable.getProp;

public enum Paths {
    BASE_URL(getProp("BaseUrl")),
    POST_USER("/usuarios");

    private String path;

    Paths(String path){
        this.path = path;
    }

    public String getPath() {
        return this.path;
    }
}
