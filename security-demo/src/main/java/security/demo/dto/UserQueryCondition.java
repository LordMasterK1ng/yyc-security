package security.demo.dto;

/**
 * @author 姚琛
 * @description
 * @date 2019/5/15
 */
public class UserQueryCondition {
    private String username;
    private Integer age;
    private Integer ageTo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(Integer ageTo) {
        this.ageTo = ageTo;
    }
}
