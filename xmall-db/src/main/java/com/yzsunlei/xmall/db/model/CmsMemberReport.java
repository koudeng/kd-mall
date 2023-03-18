package com.yzsunlei.xmall.db.model;

import java.io.Serializable;
import java.util.Date;

public class CmsMemberReport implements Serializable {
    private Long id;

    /**
     * 举报类型：0->商品评价；1->话题内容；2->用户评论
     *
     * @mbg.generated
     */
    private Integer reportType;

    /**
     * 举报人名称
     *
     * @mbg.generated
     */
    private String reportMemberName;

    /**
     * 举报内容
     *
     * @mbg.generated
     */
    private String reportObject;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 举报状态：0->未处理；1->已处理
     *
     * @mbg.generated
     */
    private Integer reportStatus;

    /**
     * 处理结果：0->无效；1->有效；2->恶意
     *
     * @mbg.generated
     */
    private Integer handleStatus;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String note;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getReportType() {
        return reportType;
    }

    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    public String getReportMemberName() {
        return reportMemberName;
    }

    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName;
    }

    public String getReportObject() {
        return reportObject;
    }

    public void setReportObject(String reportObject) {
        this.reportObject = reportObject;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    public Integer getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reportType=").append(reportType);
        sb.append(", reportMemberName=").append(reportMemberName);
        sb.append(", reportObject=").append(reportObject);
        sb.append(", createTime=").append(createTime);
        sb.append(", reportStatus=").append(reportStatus);
        sb.append(", handleStatus=").append(handleStatus);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}