/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。\n");
		System.out.println("売上の割合\n売上合計   \\" + allPrice);
		System.out.println("\n内訳");
		System.out.println("シトロン      \\" + (int) (CitroPrice * CitronBuyCount) + "・・・ "
				+ (int) ((CitroPrice * CitronBuyCount) / allPrice * 100) + "%");
		System.out.println("シトロン      \\" + (int) (ChocolatPrice * ChocolatBuyCount) + "・・・ "
				+ (int) ((ChocolatPrice * ChocolatBuyCount) / allPrice * 100) + "%");
		System.out.println("シトロン      \\" + (int) (PistachePrice * PistacheBuyCount) + "・・・ "
				+ (int) ((PistachePrice * PistacheBuyCount) / allPrice * 100) + "%");

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味   ・・・ " + (int) ((CitroPrice * CitronBuyCount) / allPrice * 100) + "%");
		System.out.println("シトロンの味   ・・・ " + (int) ((ChocolatPrice * ChocolatBuyCount) / allPrice * 100) + "%");
		System.out.println("シトロンの味   ・・・ " + (int) ((PistachePrice * PistacheBuyCount) / allPrice * 100) + "%");

		System.out.println("\nが楽しめます！\n");
		System.out.println("値段は\\" + (int) (allPrice / allCount - (allPrice / allCount % 10)) + "です。");
	}

}
