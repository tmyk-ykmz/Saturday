package sample;

import lib.Input;

public class Exec {

	public static void main(String[] args) {

		String inputColor = Input.getString("色(英語)");

		if(inputColor==null){
			inputColor = "";
		}

		Color color = new Color(inputColor);

		if(Check.checkColor(color.getColorName())){
			System.out.println(inputColor + "は" + color.getColorName() + "です。");
		}else{
			System.err.println("入力された色は登録されていません。");
		}

	}

}