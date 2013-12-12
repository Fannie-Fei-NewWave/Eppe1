
package gov.hhs.cms.eppe.vo;

import java.io.Serializable;
import java.util.Date;

/** 
 * 
 This is UserVO test...

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UserVO">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="requestId"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userId"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userFirstName"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userLastName"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userEmailAdr"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userStrAdr1"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userStrAdr2"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userIdCreat"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userIdUpdt"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userStrCityName"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userStrState"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="userStrZip"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="personPrexCode"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="userTypeCode"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="userStusCode"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="perSfxCode"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="userPhoneNumber"/>
 *     &lt;xs:element type="xs:dateTime" nillable="true" name="CreatTs"/>
 *     &lt;xs:element type="xs:dateTime" nillable="true" name="UpdateTs"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UserVO implements Serializable
{
    private int requestId;
    private String userId;
    private String userFirstName;
    private String userLastName;
    private String userEmailAdr;
    private String userStrAdr1;
    private String userStrAdr2;
    private String userIdCreat;
    private String userIdUpdt;
    private String userStrCityName;
    private String userStrState;
    private Integer userStrZip;
    private Integer personPrexCode;
    private Integer userTypeCode;
    private Integer userStusCode;
    private Integer perSfxCode;
    private Integer userPhoneNumber;
    private Date creatTs;
    private Date updateTs;

    /** 
     * Get the 'requestId' element value.
     * 
     * @return value
     */
    public int getRequestId() {
        return requestId;
    }

    /** 
     * Set the 'requestId' element value.
     * 
     * @param requestId
     */
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    /** 
     * Get the 'userId' element value.
     * 
     * @return value
     */
    public String getUserId() {
        return userId;
    }

    /** 
     * Set the 'userId' element value.
     * 
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /** 
     * Get the 'userFirstName' element value.
     * 
     * @return value
     */
    public String getUserFirstName() {
        return userFirstName;
    }

    /** 
     * Set the 'userFirstName' element value.
     * 
     * @param userFirstName
     */
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    /** 
     * Get the 'userLastName' element value.
     * 
     * @return value
     */
    public String getUserLastName() {
        return userLastName;
    }

    /** 
     * Set the 'userLastName' element value.
     * 
     * @param userLastName
     */
    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    /** 
     * Get the 'userEmailAdr' element value.
     * 
     * @return value
     */
    public String getUserEmailAdr() {
        return userEmailAdr;
    }

    /** 
     * Set the 'userEmailAdr' element value.
     * 
     * @param userEmailAdr
     */
    public void setUserEmailAdr(String userEmailAdr) {
        this.userEmailAdr = userEmailAdr;
    }

    /** 
     * Get the 'userStrAdr1' element value.
     * 
     * @return value
     */
    public String getUserStrAdr1() {
        return userStrAdr1;
    }

    /** 
     * Set the 'userStrAdr1' element value.
     * 
     * @param userStrAdr1
     */
    public void setUserStrAdr1(String userStrAdr1) {
        this.userStrAdr1 = userStrAdr1;
    }

    /** 
     * Get the 'userStrAdr2' element value.
     * 
     * @return value
     */
    public String getUserStrAdr2() {
        return userStrAdr2;
    }

    /** 
     * Set the 'userStrAdr2' element value.
     * 
     * @param userStrAdr2
     */
    public void setUserStrAdr2(String userStrAdr2) {
        this.userStrAdr2 = userStrAdr2;
    }

    /** 
     * Get the 'userIdCreat' element value.
     * 
     * @return value
     */
    public String getUserIdCreat() {
        return userIdCreat;
    }

    /** 
     * Set the 'userIdCreat' element value.
     * 
     * @param userIdCreat
     */
    public void setUserIdCreat(String userIdCreat) {
        this.userIdCreat = userIdCreat;
    }

    /** 
     * Get the 'userIdUpdt' element value.
     * 
     * @return value
     */
    public String getUserIdUpdt() {
        return userIdUpdt;
    }

    /** 
     * Set the 'userIdUpdt' element value.
     * 
     * @param userIdUpdt
     */
    public void setUserIdUpdt(String userIdUpdt) {
        this.userIdUpdt = userIdUpdt;
    }

    /** 
     * Get the 'userStrCityName' element value.
     * 
     * @return value
     */
    public String getUserStrCityName() {
        return userStrCityName;
    }

    /** 
     * Set the 'userStrCityName' element value.
     * 
     * @param userStrCityName
     */
    public void setUserStrCityName(String userStrCityName) {
        this.userStrCityName = userStrCityName;
    }

    /** 
     * Get the 'userStrState' element value.
     * 
     * @return value
     */
    public String getUserStrState() {
        return userStrState;
    }

    /** 
     * Set the 'userStrState' element value.
     * 
     * @param userStrState
     */
    public void setUserStrState(String userStrState) {
        this.userStrState = userStrState;
    }

    /** 
     * Get the 'userStrZip' element value.
     * 
     * @return value
     */
    public Integer getUserStrZip() {
        return userStrZip;
    }

    /** 
     * Set the 'userStrZip' element value.
     * 
     * @param userStrZip
     */
    public void setUserStrZip(Integer userStrZip) {
        this.userStrZip = userStrZip;
    }

    /** 
     * Get the 'personPrexCode' element value.
     * 
     * @return value
     */
    public Integer getPersonPrexCode() {
        return personPrexCode;
    }

    /** 
     * Set the 'personPrexCode' element value.
     * 
     * @param personPrexCode
     */
    public void setPersonPrexCode(Integer personPrexCode) {
        this.personPrexCode = personPrexCode;
    }

    /** 
     * Get the 'userTypeCode' element value.
     * 
     * @return value
     */
    public Integer getUserTypeCode() {
        return userTypeCode;
    }

    /** 
     * Set the 'userTypeCode' element value.
     * 
     * @param userTypeCode
     */
    public void setUserTypeCode(Integer userTypeCode) {
        this.userTypeCode = userTypeCode;
    }

    /** 
     * Get the 'userStusCode' element value.
     * 
     * @return value
     */
    public Integer getUserStusCode() {
        return userStusCode;
    }

    /** 
     * Set the 'userStusCode' element value.
     * 
     * @param userStusCode
     */
    public void setUserStusCode(Integer userStusCode) {
        this.userStusCode = userStusCode;
    }

    /** 
     * Get the 'perSfxCode' element value.
     * 
     * @return value
     */
    public Integer getPerSfxCode() {
        return perSfxCode;
    }

    /** 
     * Set the 'perSfxCode' element value.
     * 
     * @param perSfxCode
     */
    public void setPerSfxCode(Integer perSfxCode) {
        this.perSfxCode = perSfxCode;
    }

    /** 
     * Get the 'userPhoneNumber' element value.
     * 
     * @return value
     */
    public Integer getUserPhoneNumber() {
        return userPhoneNumber;
    }

    /** 
     * Set the 'userPhoneNumber' element value.
     * 
     * @param userPhoneNumber
     */
    public void setUserPhoneNumber(Integer userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    /** 
     * Get the 'CreatTs' element value.
     * 
     * @return value
     */
    public Date getCreatTs() {
        return creatTs;
    }

    /** 
     * Set the 'CreatTs' element value.
     * 
     * @param creatTs
     */
    public void setCreatTs(Date creatTs) {
        this.creatTs = creatTs;
    }

    /** 
     * Get the 'UpdateTs' element value.
     * 
     * @return value
     */
    public Date getUpdateTs() {
        return updateTs;
    }

    /** 
     * Set the 'UpdateTs' element value.
     * 
     * @param updateTs
     */
    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }
}
