package entity;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Data {

    private int id,catID,isClosed;
    private String shopName,catName,ph1,ph2,ph3,ph4,ph5,
            phPerson1,phPerson2,phPerson3,phPerson4,phPerson5,
            address,notes,followupDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatID() {
        return catID;
    }

    public void setCatID(int catID) {
        this.catID = catID;
    }

    public int getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(int isClosed) {
        this.isClosed = isClosed;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getPh1() {
        return ph1;
    }

    public void setPh1(String ph1) {
        this.ph1 = ph1;
    }

    public String getPh2() {
        return ph2;
    }

    public void setPh2(String ph2) {
        this.ph2 = ph2;
    }

    public String getPh3() {
        return ph3;
    }

    public void setPh3(String ph3) {
        this.ph3 = ph3;
    }

    public String getPh4() {
        return ph4;
    }

    public void setPh4(String ph4) {
        this.ph4 = ph4;
    }

    public String getPh5() {
        return ph5;
    }

    public void setPh5(String ph5) {
        this.ph5 = ph5;
    }

    public String getPhPerson1() {
        return phPerson1;
    }

    public void setPhPerson1(String phPerson1) {
        this.phPerson1 = phPerson1;
    }

    public String getPhPerson2() {
        return phPerson2;
    }

    public void setPhPerson2(String phPerson2) {
        this.phPerson2 = phPerson2;
    }

    public String getPhPerson3() {
        return phPerson3;
    }

    public void setPhPerson3(String phPerson3) {
        this.phPerson3 = phPerson3;
    }

    public String getPhPerson4() {
        return phPerson4;
    }

    public void setPhPerson4(String phPerson4) {
        this.phPerson4 = phPerson4;
    }

    public String getPhPerson5() {
        return phPerson5;
    }

    public void setPhPerson5(String phPerson5) {
        this.phPerson5 = phPerson5;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getFollowupDate() {
        return followupDate;
    }
    
    public Date getFormattedFollowupDate() {
        Date date2050 = null;
        try{
            date2050 = new SimpleDateFormat("yyyy-MM-dd").parse("2050-01-01");
            
            Date receving = new SimpleDateFormat("yyyy-MM-dd").parse(followupDate);
            
            return receving;
        }catch(Exception e){return date2050;}
    }
    
    public String getFormattedStringFollowupDate() {
        Date date2050 = null;
        try{
            date2050 = new SimpleDateFormat("yyyy-MM-dd").parse("2050-01-01");
            
            Date receving = new SimpleDateFormat("yyyy-MM-dd").parse(followupDate);
            
            return new SimpleDateFormat("dd MMM yyyy").format(receving);
        }catch(Exception e){return "";}
    }

    public void setFollowupDate(String followupDate) {
        this.followupDate = followupDate;
    }

    public static Type getDataType(){
        return new TypeToken<List<Data>>(){}.getType();
    }
}
