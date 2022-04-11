import java.util.Scanner;

public class Common {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 회원가입  2. 로그인  3. 아이디 찾기  4. 비밀번호 찾기");
		int num = scan.nextInt();
		if(num == 1) {
			
		}else if(num == 2) {
			LoginImp lo = new LoginImp();
			lo.checkId();
			lo.login();
		}else if(num == 3) {
			
		}else if(num == 4){
			
		}else {
			System.out.println("다시 입력하세요");
		}
	}

}
