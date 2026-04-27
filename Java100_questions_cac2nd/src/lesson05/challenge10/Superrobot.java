package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TheRobot {
	String makeLuxuryDish(int beef, int shrimp, int rice, int egg) {

		if (beef >= 200 && shrimp >= 5 && rice >= 300 && egg >= 2) {
			return "ステーキ海老チャーハン";
		} else if (beef >= 200 && rice >= 200) {
			return "高級ビーフ丼";
		} else if (shrimp >= 5 && egg >= 2) {
			return "海老オムレツ";
		} else {
			return "特製まかない料理";
		}
	}
}

public class Superrobot {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Rさん：");
		System.out.println("今度は自分で高性能な調理ロボットを作ってみます。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("牛肉の量を入力してください（グラム）＞");
		int beef = Integer.parseInt(br.readLine());

		System.out.print("\n海老の個数を入力してください＞");
		int shrimp = Integer.parseInt(br.readLine());

		System.out.print("\nご飯の量を入力してください（グラム）＞");
		int rice = Integer.parseInt(br.readLine());

		System.out.print("\n卵の個数を入力してください＞");
		int egg = Integer.parseInt(br.readLine());

		TheRobot superRobot = new TheRobot();

		String menu = superRobot.makeLuxuryDish(beef, shrimp, rice, egg);

		System.out.println("\n" + menu + "が出来ました。");
		System.out.println("さすが高性能ロボットです。");

	}

}
