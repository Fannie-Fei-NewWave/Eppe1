
package gov.hhs.cms.eppe.vo;

import java.io.Serializable;

/** 
 * 
 Test Test Test

 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="DuaVO">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="duaId"/>
 *     &lt;xs:element type="xs:string" name="duaName"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class DuaVO implements Serializable
{
    private int duaId;
    private String duaName;

    /** 
     * Get the 'duaId' element value.
     * 
     * @return value
     */
    public int getDuaId() {
        return duaId;
    }

    /** 
     * Set the 'duaId' element value.
     * 
     * @param duaId
     */
    public void setDuaId(int duaId) {
        this.duaId = duaId;
    }

    /** 
     * Get the 'duaName' element value.
     * 
     * @return value
     */
    public String getDuaName() {
        return duaName;
    }

    /** 
     * Set the 'duaName' element value.
     * 
     * @param duaName
     */
    public void setDuaName(String duaName) {
        this.duaName = duaName;
    }
}
