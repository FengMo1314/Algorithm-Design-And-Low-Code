/**
 * 
 */
package f20220716����ʵ�����β���3;

/**
 * @author ����(����)
 *
 */
public class T4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int minX = (int) Double.POSITIVE_INFINITY;		//��֤����ĳ�ʼ��Сֵ�㹻��		
		int maxX = (int) Double.NEGATIVE_INFINITY;		//��֤����ĳ�ʼ���ֵ�㹻С		
		for(int i = 0; i < A.length; i++){			
			if(A[i][0] < minX)				
				minX = A[i][0];			
			if(A[i][0] > maxX)				
				maxX = A[i][0];		
			}		
		int mid = (minX + maxX)/2;
	
		int p=0,t=0;
		for(int i=0;i<n;i++) {   //��x����ֳ���������
			if(A[i][0]<=mid) {			
				B[p][0]=A[i][0];
				B[p][1]=A[i][1];
				p++;
			}
			else {
				C[t][0]=A[i][0];
				C[t][1]=A[i][1];
				t++;
			}
		}
		
		int d1=(int) Double.POSITIVE_INFINITY,d2=(int) Double.POSITIVE_INFINITY;  //�������ߵľ�����СֵΪ�ϴ����ֵ
		int dx=0,dy=0,dz=0;
		for(int i=0;i<=p-2;i++)    //�ó�d1��ֵ
			for(int j=i+1;j<=p-1;j++) {
				dx=(B[j][0]-B[i][0])*(B[j][0]-B[i][0])+(B[j][1]-B[i][1])*(B[j][1]-B[i][1]);
				if(dx<d1) {
					d1=dx;
					x1=i;  //��¼�����������
					x2=j;
				}
			}
		
		for(int i=0;i<=t-2;i++)    //�ó�d2��ֵ
			for(int j=i+1;j<=t-1;j++) {
				dy=(C[j][0]-C[i][0])*(C[j][0]-C[i][0])+(C[j][1]-C[i][1])*(C[j][1]-C[i][1]);
				if(dy<d2) {
					d2=dy;
					x3=i;  //��¼�����������
					x4=j;
				}
			}
		System.out.println("mid="+mid+" "+"d1="+d1+" "+"d2="+d2);
		
		if(d1<d2) {
			dz=d1;
			dis1=Math.sqrt(dz);
			System.out.println("x�����е���С�����������Ϊ��"+A[x1][0]+","+A[x1][1]+" "+A[x2][0]+","+A[x2][1]);
			System.out.println("��С����Ϊ��"+dis1);
			x=x1;
			y=x2;
		}else {
			dz=d2;
			dis1=Math.sqrt(dz);
			System.out.println("x�����е���С�����������Ϊ��"+A[x3][0]+","+A[x3][1]+" "+A[x4][0]+","+A[x4][1]);
			System.out.println("��С����Ϊ��"+dis1);
			x=x3;
			y=x4;
		}
		
		int q=0;
		for(int i=0;i<n;i++) {
			if((mid-dis1)<=A[i][0] && A[i][0]<=(mid+dis1)) {  //�������������ߵ���С������Ѱ�����ߵ������
				D[q][0]=A[i][0];
				D[q][1]=A[i][1];
				q++;
	}
	}
			double mind=Double.POSITIVE_INFINITY;//mind����Ϊ���������Ϊ�Ƚ�ֵ
			double dis=0;
			for(int k=0;k<=q-2;k++)
				for(int j=k+1;j<=q-1;j++) {
					dis=(D[j][0]-D[k][0])*(D[j][0]-D[k][0])+(D[j][1]-D[k][1])*(D[j][1]-D[k][1]);
					if(dis<mind) {
						mind=dis;
						y1=k;  //��¼�����������
						y2=j;
					}
				}
			dis2=Math.sqrt(mind);
			System.out.println("dis1="+dis1+" "+"dis2="+dis2);
			
			if(dis1<dis2) {
				System.out.println("��С����Ϊ��"+dis1);
				System.out.print("������ֱ�Ϊ��"+"("+A[x][0]+","+A[x][1]+")");
				System.out.println(" "+"("+A[y][0]+","+A[y][1]+")" );
			}else {
				System.out.println("��С����Ϊ��"+dis2);
				System.out.print("������ֱ�Ϊ��"+"("+A[y1][0]+","+A[y1][1]+")");
				System.out.println(" "+"("+A[y2][0]+","+A[y2][1]+")" );
			}

	}

}
