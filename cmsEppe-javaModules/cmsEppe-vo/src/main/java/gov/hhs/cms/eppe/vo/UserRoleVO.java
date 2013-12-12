
package gov.hhs.cms.eppe.vo;

import java.io.Serializable;
import java.util.Date;

/** 
 * 
 This is UserRoleVO test...

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UserRoleVO">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="roleId"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userId"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userUpdtUserId"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userIdCreat"/>
 *     &lt;xs:element type="xs:string" nillable="true" name="userEntId"/>
 *     &lt;xs:element type="xs:dateTime" nillable="true" name="updateTs"/>
 *     &lt;xs:element type="xs:dateTime" nillable="true" name="userEfctvDt"/>
 *     &lt;xs:element type="xs:dateTime" nillable="true" name="creatTs"/>
 *     &lt;xs:element type="xs:dateTime" nillable="true" name="userTrmntnDt"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UserRoleVO implements Serializable
{
    private int roleId;
    private String userId;
    private String userUpdtUserId;
    private String userIdCreat;
    private String userEntId;
    private Date updateTs;
    private Date userEfctvDt;
    private Date creatTs;
    private Date userTrmntnDt;

    /** 
     * Get the 'roleId' element value.
     * 
     * @return value
     */
    public int getRoleId() {
        return roleId;
    }

    /** 
     * Set the 'roleId' element value.
     * 
     * @param roleId
     */
    public void setRoleId(int roleId) {
        this.roleId = roleId;
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
     * Get the 'userUpdtUserId' element value.
     * 
     * @return value
     */
    public String getUserUpdtUserId() {
        return userUpdtUserId;
    }

    /** 
     * Set the 'userUpdtUserId' element value.
     * 
     * @param userUpdtUserId
     */
    public void setUserUpdtUserId(String userUpdtUserId) {
        this.userUpdtUserId = userUpdtUserId;
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
     * Get the 'userEntId' element value.
     * 
     * @return value
     */
    public String getUserEntId() {
        return userEntId;
    }

    /** 
     * Set the 'userEntId' element value.
     * 
     * @param userEntId
     */
    public void setUserEntId(String userEntId) {
        this.userEntId = userEntId;
    }

    /** 
     * Get the 'updateTs' element value.
     * 
     * @return value
     */
    public Date getUpdateTs() {
        return updateTs;
    }

    /** 
     * Set the 'updateTs' element value.
     * 
     * @param updateTs
     */
    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    /** 
     * Get the 'userEfctvDt' element value.
     * 
     * @return value
     */
    public Date getUserEfctvDt() {
        return userEfctvDt;
    }

    /** 
     * Set the 'userEfctvDt' element value.
     * 
     * @param userEfctvDt
     */
    public void setUserEfctvDt(Date userEfctvDt) {
        this.userEfctvDt = userEfctvDt;
    }

    /** 
     * Get the 'creatTs' element value.
     * 
     * @return value
     */
    public Date getCreatTs() {
        return creatTs;
    }

    /** 
     * Set the 'creatTs' element value.
     * 
     * @param creatTs
     */
    public void setCreatTs(Date creatTs) {
        this.creatTs = creatTs;
    }

    /** 
     * Get the 'userTrmntnDt' element value.
     * 
     * @return value
     */
    public Date getUserTrmntnDt() {
        return userTrmntnDt;
    }

    /** 
     * Set the 'userTrmntnDt' element value.
     * 
     * @param userTrmntnDt
     */
    public void setUserTrmntnDt(Date userTrmntnDt) {
        this.userTrmntnDt = userTrmntnDt;
    }
}
