package ClassConfirmEx;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService memberservice = new MemberService();
		boolean resualt = memberservice.login("hong","12345");
		if(resualt) {
			System.out.println("로그인 되었습니다.");
			memberservice.logout("hong");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
