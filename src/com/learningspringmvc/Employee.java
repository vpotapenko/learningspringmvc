package com.learningspringmvc;

import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created with IntelliJ IDEA.
 * User: Vyacheslav_Potapenko
 * Date: 7/15/13
 * Time: 4:39 PM
 */

@ScriptAssert(
        lang = "javascript",
        script = "_this.id.equals(\"100\")")
public class Employee {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @NotNull
    @Size(min = 1, max = 10)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
