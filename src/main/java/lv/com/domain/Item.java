package lv.com.domain;

import java.util.Date;

/**
 * Created by lvbaolin on 2017/1/20.
 */
public class Item {

    /**
     *ING-项目进行
     *FINISH-项目完成
     *DELETE-项目删除
     */
    public static String ING = "ING";
    public static String FINISH = "FINISH";
    public static String DELETE = "DELETE";

    private Integer id;
    private String name;
    private String person; //负责人
    private String itemNo; //项目编号
    private String image; //图片
    private String status = Item.ING;	//项目状态
    private Date dateCreated; //生成时间


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
