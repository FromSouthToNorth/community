package life.hy.community.model;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community..comment.id
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community..comment.parent_id
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community..comment.type
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community..comment.commentator
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    private Integer commentator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community..comment.gmt_create
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community..comment.gmt_modified
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community..comment.like_count
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    private Long likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community..comment.content
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column community..comment.comment_count
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    private Integer commentCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community..comment.id
     *
     * @return the value of community..comment.id
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community..comment.id
     *
     * @param id the value for community..comment.id
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community..comment.parent_id
     *
     * @return the value of community..comment.parent_id
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community..comment.parent_id
     *
     * @param parentId the value for community..comment.parent_id
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community..comment.type
     *
     * @return the value of community..comment.type
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community..comment.type
     *
     * @param type the value for community..comment.type
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community..comment.commentator
     *
     * @return the value of community..comment.commentator
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public Integer getCommentator() {
        return commentator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community..comment.commentator
     *
     * @param commentator the value for community..comment.commentator
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public void setCommentator(Integer commentator) {
        this.commentator = commentator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community..comment.gmt_create
     *
     * @return the value of community..comment.gmt_create
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community..comment.gmt_create
     *
     * @param gmtCreate the value for community..comment.gmt_create
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community..comment.gmt_modified
     *
     * @return the value of community..comment.gmt_modified
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community..comment.gmt_modified
     *
     * @param gmtModified the value for community..comment.gmt_modified
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community..comment.like_count
     *
     * @return the value of community..comment.like_count
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public Long getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community..comment.like_count
     *
     * @param likeCount the value for community..comment.like_count
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community..comment.content
     *
     * @return the value of community..comment.content
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community..comment.content
     *
     * @param content the value for community..comment.content
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column community..comment.comment_count
     *
     * @return the value of community..comment.comment_count
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column community..comment.comment_count
     *
     * @param commentCount the value for community..comment.comment_count
     *
     * @mbg.generated Fri Jan 31 15:41:05 CST 2020
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }
}