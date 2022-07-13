package unit_1_1_Assignment_rj0504;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Demo1 {
	static List<COVID_19> covidList = new ArrayList<>();
	static COVID_19 covid;
	static Document doc;
	static String path = "src\\COVID-19\\COVID-19 CORONAVIRUS PANDEMIC.html";
	static File file = new File(path);
	static void getCovid_19() {
		try {
			doc = Jsoup.parse(file, "utf-8");
			Elements el = doc.select("tr");
			boolean isHeader = true;
			for (Element es : el) {
				if (isHeader) {
					isHeader = false;
					continue;
				}
				covid = new COVID_19();
				covidList.add(covid);
				Elements els = es.select("td");
				int i = 0;
				for (Element e : els) {
					String s = e.text();
					switch (i) {
					case 0:
						covid.setCountry(s);
						break;
					case 1:
						covid.setTotalCases(s);
						break;
					case 2:
						covid.setNewCases(s);
						break;
					case 3:
						covid.setTotalDeaths(s);
						break;
					case 4:
						covid.setNewDeaths(s);
						break;
					case 5:
						covid.setTotalRecovered(s);
						break;
					case 6:
						covid.setNewRecovered(s);
						break;
					case 7:
						covid.setActiveCases(s);
						break;
					case 8:
						covid.setSeriouCritical(s);
						break;
					case 9:
						covid.setTotalTests(s);
						break;
					case 10:
						covid.setPopulation(s);
						break;
					}
					i++;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
     System.out.println("！HTML获取成功！");
		}
	}

	static void sortS() {
		Demo1.getCovid_19();
		Comparator<COVID_19> c = new Comparator<>() {
			@Override
			public int compare(COVID_19 o1, COVID_19 o2) {
				int a = (int) Long.parseLong(o1.getTotalCases());
				int b = (int) Long.parseLong(o2.getTotalCases());
				if (a > b) {
					return -1;
				}
				if (a < b) {
					return 1;
				}
				return 0;
			}
		};
		Collections.sort(covidList, c);
		System.out.println("总感染人数排名榜（降序）");
		int id=1;
		for (COVID_19 c1 : covidList) {
			System.out.println("第"+id+":"+c1.getCountry());
			id++;
		}
	}
	public static void maxTotalDeaths() {
		Demo1.getCovid_19();
		int max = 0;
		for (COVID_19 element : covidList) {
			int a=Integer.parseInt(element.getTotalDeaths());
			if(max<a) {
				max=a;
			}
		}
		String maxs=String.valueOf(max);
		for (COVID_19 c : covidList) {
			if(c.getTotalDeaths().equals(maxs)) {
				System.out.println("死亡数最多的国家:\t"+c.getCountry()+";\t死亡人数:\t"+max+"。");
				break;
			}
		}
	}
	public static void maxTotalTests(){
		Demo1.getCovid_19();
		int max = 0;
		for (COVID_19 element : covidList) {
			int a=Integer.parseInt(element.getTotalTests());
			if(max<a) {
				max=a;
			}
		}
		String maxs=String.valueOf(max);
		for (COVID_19 c : covidList) {
			if(c.getTotalTests().equals(maxs)) {
				System.out.println("总测试数最多的国家:\t"+c.getCountry()+";\t总测试人数人数:\t"+max+"。");
				break;
			}
		}
	}
	public static void main(String[] args) {
		Demo1.getCovid_19();
		Demo1.sortS();
		Demo1. maxTotalDeaths();
		Demo1.maxTotalTests();
	}

}
