package com.cxt.model;

import java.util.Date;

/**
 * @version 2019年12月23日 下午4:45:16
 */
public class DepartmentAdministrativeLicense
{
    private String id;

    // 证件号码
    private String identificationNo;
    // 许可相对人
    private String name;

    // 许可类型
    private Integer type;

    private Integer status = 0;

    // 统一社会信用代码（三证必须选一填写）
    private String socialCreditCode;

    // 组织机构代码
    private String organizationCode;

    // 工商注册号
    private String commercialRegistrationNumber;

    // 税务登记号
    private String taxRegistrationNumber;

    // 法定代表人或负责人
    private String chargePerson;

    // 证件类型
    private Integer identificationType;

    // 审批类别
    private String examineType;

    // 许可名称
    private String licenseName;

    // 许可文书号
    private String licenseDocumentNumber;

    // 许可权力编码
    private String licenseAuthorityCode;

    // 许可决定日期
    private Date licenseDecisionTime;

    // 许可有效期（始）
    private Date licenseEffectivityStartTime;

    // 许可有效期（终）
    private Date licenseEffectivityEndTime;

    // 许可机构
    private String licenseOrganization;

    // 许可内容
    private String licenseText;

    // 信息使用范围：0.公示；1.仅政府部门内部共享；2.仅可授权查询；
    private Integer informationUsageScope;

    // 许可状态：0=正常；1=撤销；2=异议；3=其他（备注说明）
    private Integer licenseStatus;

    // 备注
    private String remark;

    // 许可证书名称
    private String licenseCertificateName;

    // 许可证书编号
    private String licenseCertificateNumber;

    // 许可文书名称
    private String licenseDocumentName;

    // 许可机构统一社会信用代码
    private String licenseSocialCreditCode;

    // 事业单位证书号
    private String institutionCertificateNumber;

    // 社会组织登记证号
    private String socialOrganizationRegistrationNumber;

    // 数据来源单位
    private String dataSourceUnit;

    // 数据来源统一社会信用代码
    private String sourceSocialCreditCode;

    public DepartmentAdministrativeLicense()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdentificationNo() {
        return identificationNo;
    }

    public void setIdentificationNo(String identificationNo) {
        this.identificationNo = identificationNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getCommercialRegistrationNumber() {
        return commercialRegistrationNumber;
    }

    public void setCommercialRegistrationNumber(String commercialRegistrationNumber) {
        this.commercialRegistrationNumber = commercialRegistrationNumber;
    }

    public String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    public void setTaxRegistrationNumber(String taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public String getChargePerson() {
        return chargePerson;
    }

    public void setChargePerson(String chargePerson) {
        this.chargePerson = chargePerson;
    }

    public Integer getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(Integer identificationType) {
        this.identificationType = identificationType;
    }

    public String getExamineType() {
        return examineType;
    }

    public void setExamineType(String examineType) {
        this.examineType = examineType;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getLicenseDocumentNumber() {
        return licenseDocumentNumber;
    }

    public void setLicenseDocumentNumber(String licenseDocumentNumber) {
        this.licenseDocumentNumber = licenseDocumentNumber;
    }

    public String getLicenseAuthorityCode() {
        return licenseAuthorityCode;
    }

    public void setLicenseAuthorityCode(String licenseAuthorityCode) {
        this.licenseAuthorityCode = licenseAuthorityCode;
    }

    public Date getLicenseDecisionTime() {
        return licenseDecisionTime;
    }

    public void setLicenseDecisionTime(Date licenseDecisionTime) {
        this.licenseDecisionTime = licenseDecisionTime;
    }

    public Date getLicenseEffectivityStartTime() {
        return licenseEffectivityStartTime;
    }

    public void setLicenseEffectivityStartTime(Date licenseEffectivityStartTime) {
        this.licenseEffectivityStartTime = licenseEffectivityStartTime;
    }

    public Date getLicenseEffectivityEndTime() {
        return licenseEffectivityEndTime;
    }

    public void setLicenseEffectivityEndTime(Date licenseEffectivityEndTime) {
        this.licenseEffectivityEndTime = licenseEffectivityEndTime;
    }

    public String getLicenseOrganization() {
        return licenseOrganization;
    }

    public void setLicenseOrganization(String licenseOrganization) {
        this.licenseOrganization = licenseOrganization;
    }

    public String getLicenseText() {
        return licenseText;
    }

    public void setLicenseText(String licenseText) {
        this.licenseText = licenseText;
    }

    public Integer getInformationUsageScope() {
        return informationUsageScope;
    }

    public void setInformationUsageScope(Integer informationUsageScope) {
        this.informationUsageScope = informationUsageScope;
    }

    public Integer getLicenseStatus() {
        return licenseStatus;
    }

    public void setLicenseStatus(Integer licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLicenseCertificateName() {
        return licenseCertificateName;
    }

    public void setLicenseCertificateName(String licenseCertificateName) {
        this.licenseCertificateName = licenseCertificateName;
    }

    public String getLicenseCertificateNumber() {
        return licenseCertificateNumber;
    }

    public void setLicenseCertificateNumber(String licenseCertificateNumber) {
        this.licenseCertificateNumber = licenseCertificateNumber;
    }

    public String getLicenseDocumentName() {
        return licenseDocumentName;
    }

    public void setLicenseDocumentName(String licenseDocumentName) {
        this.licenseDocumentName = licenseDocumentName;
    }

    public String getLicenseSocialCreditCode() {
        return licenseSocialCreditCode;
    }

    public void setLicenseSocialCreditCode(String licenseSocialCreditCode) {
        this.licenseSocialCreditCode = licenseSocialCreditCode;
    }

    public String getInstitutionCertificateNumber() {
        return institutionCertificateNumber;
    }

    public void setInstitutionCertificateNumber(String institutionCertificateNumber) {
        this.institutionCertificateNumber = institutionCertificateNumber;
    }

    public String getSocialOrganizationRegistrationNumber() {
        return socialOrganizationRegistrationNumber;
    }

    public void setSocialOrganizationRegistrationNumber(String socialOrganizationRegistrationNumber) {
        this.socialOrganizationRegistrationNumber = socialOrganizationRegistrationNumber;
    }

    public String getDataSourceUnit() {
        return dataSourceUnit;
    }

    public void setDataSourceUnit(String dataSourceUnit) {
        this.dataSourceUnit = dataSourceUnit;
    }

    public String getSourceSocialCreditCode() {
        return sourceSocialCreditCode;
    }

    public void setSourceSocialCreditCode(String sourceSocialCreditCode) {
        this.sourceSocialCreditCode = sourceSocialCreditCode;
    }

    public DepartmentAdministrativeLicense(String id, String identificationNo, String name, Integer type, Integer status, String socialCreditCode, String organizationCode, String commercialRegistrationNumber, String taxRegistrationNumber, String chargePerson, Integer identificationType, String examineType, String licenseName, String licenseDocumentNumber, String licenseAuthorityCode, Date licenseDecisionTime, Date licenseEffectivityStartTime, Date licenseEffectivityEndTime, String licenseOrganization, String licenseText, Integer informationUsageScope, Integer licenseStatus, String remark, String licenseCertificateName, String licenseCertificateNumber, String licenseDocumentName, String licenseSocialCreditCode, String institutionCertificateNumber, String socialOrganizationRegistrationNumber, String dataSourceUnit, String sourceSocialCreditCode) {
        this.id = id;
        this.identificationNo = identificationNo;
        this.name = name;
        this.type = type;
        this.status = status;
        this.socialCreditCode = socialCreditCode;
        this.organizationCode = organizationCode;
        this.commercialRegistrationNumber = commercialRegistrationNumber;
        this.taxRegistrationNumber = taxRegistrationNumber;
        this.chargePerson = chargePerson;
        this.identificationType = identificationType;
        this.examineType = examineType;
        this.licenseName = licenseName;
        this.licenseDocumentNumber = licenseDocumentNumber;
        this.licenseAuthorityCode = licenseAuthorityCode;
        this.licenseDecisionTime = licenseDecisionTime;
        this.licenseEffectivityStartTime = licenseEffectivityStartTime;
        this.licenseEffectivityEndTime = licenseEffectivityEndTime;
        this.licenseOrganization = licenseOrganization;
        this.licenseText = licenseText;
        this.informationUsageScope = informationUsageScope;
        this.licenseStatus = licenseStatus;
        this.remark = remark;
        this.licenseCertificateName = licenseCertificateName;
        this.licenseCertificateNumber = licenseCertificateNumber;
        this.licenseDocumentName = licenseDocumentName;
        this.licenseSocialCreditCode = licenseSocialCreditCode;
        this.institutionCertificateNumber = institutionCertificateNumber;
        this.socialOrganizationRegistrationNumber = socialOrganizationRegistrationNumber;
        this.dataSourceUnit = dataSourceUnit;
        this.sourceSocialCreditCode = sourceSocialCreditCode;
    }

    @Override
    public String toString() {
        return "IndexModel{" +
                "id='" + id + '\'' +
                ", identificationNo='" + identificationNo + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", socialCreditCode='" + socialCreditCode + '\'' +
                ", organizationCode='" + organizationCode + '\'' +
                ", commercialRegistrationNumber='" + commercialRegistrationNumber + '\'' +
                ", taxRegistrationNumber='" + taxRegistrationNumber + '\'' +
                ", chargePerson='" + chargePerson + '\'' +
                ", identificationType=" + identificationType +
                ", examineType='" + examineType + '\'' +
                ", licenseName='" + licenseName + '\'' +
                ", licenseDocumentNumber='" + licenseDocumentNumber + '\'' +
                ", licenseAuthorityCode='" + licenseAuthorityCode + '\'' +
                ", licenseDecisionTime=" + licenseDecisionTime +
                ", licenseEffectivityStartTime=" + licenseEffectivityStartTime +
                ", licenseEffectivityEndTime=" + licenseEffectivityEndTime +
                ", licenseOrganization='" + licenseOrganization + '\'' +
                ", licenseText='" + licenseText + '\'' +
                ", informationUsageScope=" + informationUsageScope +
                ", licenseStatus=" + licenseStatus +
                ", remark='" + remark + '\'' +
                ", licenseCertificateName='" + licenseCertificateName + '\'' +
                ", licenseCertificateNumber='" + licenseCertificateNumber + '\'' +
                ", licenseDocumentName='" + licenseDocumentName + '\'' +
                ", licenseSocialCreditCode='" + licenseSocialCreditCode + '\'' +
                ", institutionCertificateNumber='" + institutionCertificateNumber + '\'' +
                ", socialOrganizationRegistrationNumber='" + socialOrganizationRegistrationNumber + '\'' +
                ", dataSourceUnit='" + dataSourceUnit + '\'' +
                ", sourceSocialCreditCode='" + sourceSocialCreditCode + '\'' +
                '}';
    }
}
