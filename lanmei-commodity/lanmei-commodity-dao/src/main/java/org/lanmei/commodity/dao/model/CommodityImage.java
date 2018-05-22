package org.lanmei.commodity.dao.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table commodity_image
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class CommodityImage {
    /**
	 * Database Column Remarks: 商品图片ID This field was generated by MyBatis Generator. This field corresponds to the database column commodity_image.image_id
	 * @mbg.generated
	 */
	private Integer imageId;
	/**
	 * Database Column Remarks: sku_collect_id This field was generated by MyBatis Generator. This field corresponds to the database column commodity_image.sku_collect_id
	 * @mbg.generated
	 */
	private Integer skuCollectId;
	/**
	 * Database Column Remarks: 图片相对路径/相对于工程目录下 This field was generated by MyBatis Generator. This field corresponds to the database column commodity_image.path
	 * @mbg.generated
	 */
	private String path;
	/**
	 * Database Column Remarks: 图片名称　动态生成 This field was generated by MyBatis Generator. This field corresponds to the database column commodity_image.name
	 * @mbg.generated
	 */
	private String name;
	/**
	 * Database Column Remarks: 0/1,是否是主图，单个商品仅有一个设为1 This field was generated by MyBatis Generator. This field corresponds to the database column commodity_image.is_main_img
	 * @mbg.generated
	 */
	private Byte isMainImg;
	/**
	 * Database Column Remarks: 0/1,是否是属性图片，每个属性配一个图片 This field was generated by MyBatis Generator. This field corresponds to the database column commodity_image.is_attr_img
	 * @mbg.generated
	 */
	private Byte isAttrImg;
	/**
	 * Database Column Remarks: 上传人 This field was generated by MyBatis Generator. This field corresponds to the database column commodity_image.upload_by
	 * @mbg.generated
	 */
	private String uploadBy;
	/**
	 * Database Column Remarks: 上传时间 This field was generated by MyBatis Generator. This field corresponds to the database column commodity_image.upload_time
	 * @mbg.generated
	 */
	private Date uploadTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_image.image_id
	 * @return  the value of commodity_image.image_id
	 * @mbg.generated
	 */
	public Integer getImageId() {
		return imageId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_image.image_id
	 * @param imageId  the value for commodity_image.image_id
	 * @mbg.generated
	 */
	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_image.sku_collect_id
	 * @return  the value of commodity_image.sku_collect_id
	 * @mbg.generated
	 */
	public Integer getSkuCollectId() {
		return skuCollectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_image.sku_collect_id
	 * @param skuCollectId  the value for commodity_image.sku_collect_id
	 * @mbg.generated
	 */
	public void setSkuCollectId(Integer skuCollectId) {
		this.skuCollectId = skuCollectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_image.path
	 * @return  the value of commodity_image.path
	 * @mbg.generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_image.path
	 * @param path  the value for commodity_image.path
	 * @mbg.generated
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_image.name
	 * @return  the value of commodity_image.name
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_image.name
	 * @param name  the value for commodity_image.name
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_image.is_main_img
	 * @return  the value of commodity_image.is_main_img
	 * @mbg.generated
	 */
	public Byte getIsMainImg() {
		return isMainImg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_image.is_main_img
	 * @param isMainImg  the value for commodity_image.is_main_img
	 * @mbg.generated
	 */
	public void setIsMainImg(Byte isMainImg) {
		this.isMainImg = isMainImg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_image.is_attr_img
	 * @return  the value of commodity_image.is_attr_img
	 * @mbg.generated
	 */
	public Byte getIsAttrImg() {
		return isAttrImg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_image.is_attr_img
	 * @param isAttrImg  the value for commodity_image.is_attr_img
	 * @mbg.generated
	 */
	public void setIsAttrImg(Byte isAttrImg) {
		this.isAttrImg = isAttrImg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_image.upload_by
	 * @return  the value of commodity_image.upload_by
	 * @mbg.generated
	 */
	public String getUploadBy() {
		return uploadBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_image.upload_by
	 * @param uploadBy  the value for commodity_image.upload_by
	 * @mbg.generated
	 */
	public void setUploadBy(String uploadBy) {
		this.uploadBy = uploadBy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column commodity_image.upload_time
	 * @return  the value of commodity_image.upload_time
	 * @mbg.generated
	 */
	public Date getUploadTime() {
		return uploadTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column commodity_image.upload_time
	 * @param uploadTime  the value for commodity_image.upload_time
	 * @mbg.generated
	 */
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public CommodityImage() {
		super();
	}
    
	public CommodityImage(Integer commodityId, String path,String name, Byte isListDisplay, String uploadBy, Date uploadTime) {
		super();
		this.path = path;
		this.name = name;
		this.uploadBy = uploadBy;
		this.uploadTime = uploadTime;
	}
}