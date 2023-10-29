package services;

 import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1

 import java.util.ArrayList;
 import java.util.Date;

/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
class Configuration{
    @JsonProperty("nodes")
    public ArrayList<Node> getNodes() {
        return this.nodes; }
    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes; }
    ArrayList<Node> nodes;
}

class CpeMatch{
    @JsonProperty("vulnerable")
    public boolean getVulnerable() {
        return this.vulnerable; }
    public void setVulnerable(boolean vulnerable) {
        this.vulnerable = vulnerable; }
    boolean vulnerable;
    @JsonProperty("criteria")
    public String getCriteria() {
        return this.criteria; }
    public void setCriteria(String criteria) {
        this.criteria = criteria; }
    String criteria;
    @JsonProperty("matchCriteriaId")
    public String getMatchCriteriaId() {
        return this.matchCriteriaId; }
    public void setMatchCriteriaId(String matchCriteriaId) {
        this.matchCriteriaId = matchCriteriaId; }
    String matchCriteriaId;
}

class Cve {
    @JsonProperty("id")
    public String getId() {
        return this.id; }
    public void setId(String id) {
        this.id = id; }
    String id;
    @JsonProperty("sourceIdentifier")
    public String getSourceIdentifier() {
        return this.sourceIdentifier; }
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier; }
    String sourceIdentifier;
    @JsonProperty("published")
    public Date getPublished() {
        return this.published; }
    public void setPublished(Date published) {
        this.published = published; }
    Date published;
    @JsonProperty("lastModified")
    public Date getLastModified() {
        return this.lastModified; }
    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified; }
    Date lastModified;
    @JsonProperty("vulnStatus")
    public String getVulnStatus() {
        return this.vulnStatus; }
    public void setVulnStatus(String vulnStatus) {
        this.vulnStatus = vulnStatus; }
    String vulnStatus;
    @JsonProperty("descriptions")
    public ArrayList<Description> getDescriptions() {
        return this.descriptions; }
    public void setDescriptions(ArrayList<Description> descriptions) {
        this.descriptions = descriptions; }
    ArrayList<Description> descriptions;
    @JsonProperty("metrics")
    public Metrics getMetrics() {
        return this.metrics; }
    public void setMetrics(Metrics metrics) {
        this.metrics = metrics; }
    Metrics metrics;
    @JsonProperty("weaknesses")
    public ArrayList<Weakness> getWeaknesses() {
        return this.weaknesses; }
    public void setWeaknesses(ArrayList<Weakness> weaknesses) {
        this.weaknesses = weaknesses; }
    ArrayList<Weakness> weaknesses;
    @JsonProperty("configurations")
    public ArrayList<Configuration> getConfigurations() {
        return this.configurations; }
    public void setConfigurations(ArrayList<Configuration> configurations) {
        this.configurations = configurations; }
    ArrayList<Configuration> configurations;
    @JsonProperty("references")
    public ArrayList<Reference> getReferences() {
        return this.references; }
    public void setReferences(ArrayList<Reference> references) {
        this.references = references; }
    ArrayList<Reference> references;
}

class CvssData{
    @JsonProperty("version")
    public String getVersion() {
        return this.version; }
    public void setVersion(String version) {
        this.version = version; }
    String version;
    @JsonProperty("vectorString")
    public String getVectorString() {
        return this.vectorString; }
    public void setVectorString(String vectorString) {
        this.vectorString = vectorString; }
    String vectorString;
    @JsonProperty("accessVector")
    public String getAccessVector() {
        return this.accessVector; }
    public void setAccessVector(String accessVector) {
        this.accessVector = accessVector; }
    String accessVector;
    @JsonProperty("accessComplexity")
    public String getAccessComplexity() {
        return this.accessComplexity; }
    public void setAccessComplexity(String accessComplexity) {
        this.accessComplexity = accessComplexity; }
    String accessComplexity;
    @JsonProperty("authentication")
    public String getAuthentication() {
        return this.authentication; }
    public void setAuthentication(String authentication) {
        this.authentication = authentication; }
    String authentication;
    @JsonProperty("confidentialityImpact")
    public String getConfidentialityImpact() {
        return this.confidentialityImpact; }
    public void setConfidentialityImpact(String confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact; }
    String confidentialityImpact;
    @JsonProperty("integrityImpact")
    public String getIntegrityImpact() {
        return this.integrityImpact; }
    public void setIntegrityImpact(String integrityImpact) {
        this.integrityImpact = integrityImpact; }
    String integrityImpact;
    @JsonProperty("availabilityImpact")
    public String getAvailabilityImpact() {
        return this.availabilityImpact; }
    public void setAvailabilityImpact(String availabilityImpact) {
        this.availabilityImpact = availabilityImpact; }
    String availabilityImpact;
    @JsonProperty("baseScore")
    public double getBaseScore() {
        return this.baseScore; }
    public void setBaseScore(double baseScore) {
        this.baseScore = baseScore; }
    double baseScore;
}

class CvssMetricV2{
    @JsonProperty("source")
    public String getSource() {
        return this.source; }
    public void setSource(String source) {
        this.source = source; }
    String source;
    @JsonProperty("type")
    public String getType() {
        return this.type; }
    public void setType(String type) {
        this.type = type; }
    String type;
    @JsonProperty("cvssData")
    public CvssData getCvssData() {
        return this.cvssData; }
    public void setCvssData(CvssData cvssData) {
        this.cvssData = cvssData; }
    CvssData cvssData;
    @JsonProperty("baseSeverity")
    public String getBaseSeverity() {
        return this.baseSeverity; }
    public void setBaseSeverity(String baseSeverity) {
        this.baseSeverity = baseSeverity; }
    String baseSeverity;
    @JsonProperty("exploitabilityScore")
    public double getExploitabilityScore() {
        return this.exploitabilityScore; }
    public void setExploitabilityScore(double exploitabilityScore) {
        this.exploitabilityScore = exploitabilityScore; }
    double exploitabilityScore;
    @JsonProperty("impactScore")
    public double getImpactScore() {
        return this.impactScore; }
    public void setImpactScore(double impactScore) {
        this.impactScore = impactScore; }
    double impactScore;
    @JsonProperty("acInsufInfo")
    public boolean getAcInsufInfo() {
        return this.acInsufInfo; }
    public void setAcInsufInfo(boolean acInsufInfo) {
        this.acInsufInfo = acInsufInfo; }
    boolean acInsufInfo;
    @JsonProperty("obtainAllPrivilege")
    public boolean getObtainAllPrivilege() {
        return this.obtainAllPrivilege; }
    public void setObtainAllPrivilege(boolean obtainAllPrivilege) {
        this.obtainAllPrivilege = obtainAllPrivilege; }
    boolean obtainAllPrivilege;
    @JsonProperty("obtainUserPrivilege")
    public boolean getObtainUserPrivilege() {
        return this.obtainUserPrivilege; }
    public void setObtainUserPrivilege(boolean obtainUserPrivilege) {
        this.obtainUserPrivilege = obtainUserPrivilege; }
    boolean obtainUserPrivilege;
    @JsonProperty("obtainOtherPrivilege")
    public boolean getObtainOtherPrivilege() {
        return this.obtainOtherPrivilege; }
    public void setObtainOtherPrivilege(boolean obtainOtherPrivilege) {
        this.obtainOtherPrivilege = obtainOtherPrivilege; }
    boolean obtainOtherPrivilege;
    @JsonProperty("userInteractionRequired")
    public boolean getUserInteractionRequired() {
        return this.userInteractionRequired; }
    public void setUserInteractionRequired(boolean userInteractionRequired) {
        this.userInteractionRequired = userInteractionRequired; }
    boolean userInteractionRequired;
}

class Description{
    @JsonProperty("lang")
    public String getLang() {
        return this.lang; }
    public void setLang(String lang) {
        this.lang = lang; }
    String lang;
    @JsonProperty("value")
    public String getValue() {
        return this.value; }
    public void setValue(String value) {
        this.value = value; }
    String value;
}

class Description2{
    @JsonProperty("lang")
    public String getLang() {
        return this.lang; }
    public void setLang(String lang) {
        this.lang = lang; }
    String lang;
    @JsonProperty("value")
    public String getValue() {
        return this.value; }
    public void setValue(String value) {
        this.value = value; }
    String value;
}

class Metrics{
    @JsonProperty("cvssMetricV2")
    public ArrayList<CvssMetricV2> getCvssMetricV2() {
        return this.cvssMetricV2; }
    public void setCvssMetricV2(ArrayList<CvssMetricV2> cvssMetricV2) {
        this.cvssMetricV2 = cvssMetricV2; }
    ArrayList<CvssMetricV2> cvssMetricV2;
}

class Node{
    @JsonProperty("operator")
    public String getOperator() {
        return this.operator; }
    public void setOperator(String operator) {
        this.operator = operator; }
    String operator;
    @JsonProperty("negate")
    public boolean getNegate() {
        return this.negate; }
    public void setNegate(boolean negate) {
        this.negate = negate; }
    boolean negate;
    @JsonProperty("cpeMatch")
    public ArrayList<CpeMatch> getCpeMatch() {
        return this.cpeMatch; }
    public void setCpeMatch(ArrayList<CpeMatch> cpeMatch) {
        this.cpeMatch = cpeMatch; }
    ArrayList<CpeMatch> cpeMatch;
}

class Reference{
    @JsonProperty("url")
    public String getUrl() {
        return this.url; }
    public void setUrl(String url) {
        this.url = url; }
    String url;
    @JsonProperty("source")
    public String getSource() {
        return this.source; }
    public void setSource(String source) {
        this.source = source; }
    String source;
}

public class Root{
    @JsonProperty("resultsPerPage")
    public int getResultsPerPage() {
        return this.resultsPerPage; }
    public void setResultsPerPage(int resultsPerPage) {
        this.resultsPerPage = resultsPerPage; }
    int resultsPerPage;
    @JsonProperty("startIndex")
    public int getStartIndex() {
        return this.startIndex; }
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex; }
    int startIndex;
    @JsonProperty("totalResults")
    public int getTotalResults() {
        return this.totalResults; }
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults; }
    int totalResults;
    @JsonProperty("format")
    public String getFormat() {
        return this.format; }
    public void setFormat(String format) {
        this.format = format; }
    String format;
    @JsonProperty("version")
    public String getVersion() {
        return this.version; }
    public void setVersion(String version) {
        this.version = version; }
    String version;
    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return this.timestamp; }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp; }
    Date timestamp;
    @JsonProperty("vulnerabilities")
    public ArrayList<Vulnerability> getVulnerabilities() {
        return this.vulnerabilities; }
    public void setVulnerabilities(ArrayList<Vulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities; }
    ArrayList<Vulnerability> vulnerabilities;
}

class Vulnerability{
    @JsonProperty("cve")
    public Cve getCve() {
        return this.cve; }
    public void setCve(Cve cve) {
        this.cve = cve; }
    Cve cve;
}

class Weakness{
    @JsonProperty("source")
    public String getSource() {
        return this.source; }
    public void setSource(String source) {
        this.source = source; }
    String source;
    @JsonProperty("type")
    public String getType() {
        return this.type; }
    public void setType(String type) {
        this.type = type; }
    String type;
    @JsonProperty("description")
    public ArrayList<Description> getDescription() {
        return this.description; }
    public void setDescription(ArrayList<Description> description) {
        this.description = description; }
    ArrayList<Description> description;
}


