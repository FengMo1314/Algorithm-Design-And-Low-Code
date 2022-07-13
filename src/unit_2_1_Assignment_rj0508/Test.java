package unit_2_1_Assignment_rj0508;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import unit_1_1_Assignment_rj0504.COVID_19;

public class Test {
	static SeqList<COVID_19> covidList = new SeqList<>();
	static SeqList<COVID_19> newCovidList=new SeqList<>();
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
				newCovidList.add(covid);
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
			System.out.println("！HTML获取成功\n----------------------");
		}
	}

	public static void sortByTotalCases() {
		covidList=new SeqList<>(newCovidList);
	    COVID_19 temp=null;
		for (int i = 0; i < newCovidList.size()-1; i++) {
			for (int j = 0; j < newCovidList.size()-1-i; j++) {
				int a = Integer.parseInt(newCovidList.get(i).getTotalCases());
				int b = Integer.parseInt(newCovidList.get(j).getTotalCases());
				if (a > b) {
					temp=newCovidList.get(i);
					newCovidList.set(i,newCovidList.get(j));
					newCovidList.set(j, temp);
				}
			}
		}
		for(int i=0;i<covidList.size();i++) {
		System.out.println(newCovidList.get(i));
		}
	}

	public static void maxByTotalTests() {
		int max = 0;
		for (int i=0;i<covidList.size();i++) {
			int a=Integer.parseInt(covidList.get(i).getTotalTests());
			if(max<a) {
				max=a;
			}
		}
		String maxs=String.valueOf(max);
		for (int i=0;i<covidList.size();i++) {
			if(covidList.get(i).getTotalTests().equals(maxs)) {
				System.out.println("总测试数最多的国家:\t"+covidList.get(i).getCountry()+";\t总测试人数人数:\t"+max+"。");
				break;
			}
		}
	}

	public static void maxByTotalDeaths() {
		COVID_19 max = covidList.get(0);
		for (int i = 1; i < covidList.size(); i++) {
			if (covidList.get(i).getTotalDeaths().hashCode() > max.getTotalDeaths().hashCode()) {
				max = covidList.get(i);
			}
		}
		System.out.println("最大\t" + max);
	}

	public static void main(String[] args) {
//		for (int i = 0; i < covidList.size(); i++) {
//			System.out.println(covidList.get(i));
//		}
		new Test();
		Test.getCovid_19();
		Test.sortByTotalCases();
		Test.maxByTotalDeaths();
		Test.maxByTotalTests();
		System.out.println("第五个：\n" + covidList.get(4));// 查找第五个国家数据（初始下标为0）
		System.out.println(covidList.remove(covidList.size() - 1));// 删除最后一行的数据
	}
}
