package Basics;

public class FinalReferenceVariableClass {

	final static StringBuilder strb;
	static{
		strb = new StringBuilder("Greek");
	}
	
	public static void main(String[] args) {
		
	//	strb = new StringBuilder(); дем циметаи ма то йамоуле ауто еам дем евоуле INTIALIZE тгм FINAL летабкгтг.
	
	// циа паяадеицла, дем лпояоуле ма цяаьоуле пяим тгм MAIN, 	final static StringBuilder strb; йаи леса стгм лаим strb = new StringBuilder("Greek");
	// циати ха лас елжамисеи пяобкгла оти дем евеи аявийопоигхеи.
	
	// цаи ауто то коцо вягсилопоиоуле та BRACKETS йаи лета то STATIC циа ма тгм бакоуле йиа леса стгм MAIN.
		
		System.out.println(strb);
		strb.append(" Greek2");
		System.out.println(strb);
		
	}
	
}

/*

 ╪СО АМАЖОЯэ ТИР Reference final variables Г ЕСЫТЕЯИЙч ЙАТэСТАСГ ТОУ object
 ПОУ УПОДЕИЙМЩЕТАИ АПЭ АУТч ТГ reference ЛЕТАБКГТч, ЛПОЯЕъ МА АККэНЕИ
 
 */