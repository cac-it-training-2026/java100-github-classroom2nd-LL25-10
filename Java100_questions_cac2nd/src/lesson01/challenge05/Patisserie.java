/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {
		int CitroPrice = 250;
		int ChocolatPrice = 280;
		int PistachePrice = 320;

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String Citro = reader.readLine();
		int CitronBuyCount = Integer.parseInt(Citro);
		System.out.print("ショコラ      >");
		String Chocolat = reader.readLine();
		int ChocolatBuyCount = Integer.parseInt(Chocolat);
		System.out.print("ピスターシュ  >");
		String Pistache = reader.readLine();
		int PistacheBuyCount = Integer.parseInt(Pistache);

		int allCount = CitronBuyCount + ChocolatBuyCount + PistacheBuyCount;
		int allPrice = CitroPrice * CitronBuyCount + ChocolatPrice * ChocolatBuyCount
				+ PistachePrice * PistacheBuyCount;

		System.out.println("\nシトロン     " + CitronBuyCount + "個");
		System.out.println("ショコラ     " + ChocolatBuyCount + "個");
		System.out.println("ピスターシュ " + PistacheBuyCount + "個\n");

		System.out.println("合計個数    " + allCount + "個");
		System.out.println("合計金額  " + allPrice + "円");

		System.out.println("\nをお買いあげですね。\n承りました。");

	}

}
