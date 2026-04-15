/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		System.out.println("\nをお買いあげですね。\n承りました。\n");

		System.out.println("本日のおすすめ商品です。\n");

		System.out.println("シトロン      \\250 ・・・ 残り" + (30 - CitronBuyCount) + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + (30 - ChocolatBuyCount) + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + (30 - PistacheBuyCount) + "個");

	}

}
