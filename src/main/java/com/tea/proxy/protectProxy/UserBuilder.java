/**
 * @author teaho2015@gmail.com
 * since 2017/4/9
 */
package com.tea.proxy.protectProxy;

public class UserBuilder {

    private String id;
    private String name;
    private String description;

    public static UserBuilder create() {
        return new UserBuilder();
    }


    public UserBuilder id(String id) {
        this.id = id;
        return this;
    }


    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }


    public UserBuilder description(String description) {
        this.description = description;
        return this;
    }

    public UserBuilder defaultValue() {
        id = "default";
        name = "default_name";
        description = "default_description";
        return this;
    }

    public User build() {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setDescription(description);
        return user;
    }
}
