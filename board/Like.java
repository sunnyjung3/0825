package board;

public class Like {

	private int articleId;
	private String uerId;
	private int flag; // 0 - 좋아요 , 1 - 싫어요
	
	
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	public String getUerId() {
		return uerId;
	}
	public void setUerId(String uerId) {
		this.uerId = uerId;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	
}
