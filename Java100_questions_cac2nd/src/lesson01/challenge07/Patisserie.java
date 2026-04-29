/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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
		double CitronBuyCount = Double.parseDouble(Citro);
		System.out.print("ショコラ      >");
		String Chocolat = reader.readLine();
		double ChocolatBuyCount = Double.parseDouble(Chocolat);
		System.out.print("ピスターシュ  >");
		String Pistache = reader.readLine();
		double PistacheBuyCount = Double.parseDouble(Pistache);

		double allCount = CitronBuyCount + ChocolatBuyCount + PistacheBuyCount;
		int allPrice = (int) (CitroPrice * CitronBuyCount + ChocolatPrice * ChocolatBuyCount
				+ PistachePrice * PistacheBuyCount);

		System.out.println("\nシトロン     " + CitronBuyCount + "個");
		System.out.println("ショコラ     " + ChocolatBuyCount + "個");
		System.out.println("ピスターシュ " + PistacheBuyCount + "個\n");

		System.out.println("合計個数    " + allCount + "個");
		System.out.println("合計金額   " + allPrice + "円");

		System.out.println("\nをお買いあげですね。\n承りました。\n");

		System.out.println("本日のおすすめ商品です。\n");

		int CitronBuyCountint = (int) (30 - CitronBuyCount);
		int ChocolatBuyCountint = (int) (30 - ChocolatBuyCount);
		int PistacheBuyCountint = (int) (30 - PistacheBuyCount);

		System.out.println("シトロン      \\250 ・・・ 残り" + CitronBuyCountint + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + ChocolatBuyCountint + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + PistacheBuyCountint + "個");

	}

}
