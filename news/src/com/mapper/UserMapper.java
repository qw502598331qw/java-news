package com.mapper;
import java.util.List;

import com.model.ding;
import com.model.duser;
import com.model.file;
import com.model.huo;
import com.model.news;
import com.model.user;
import com.model.yonghu;

public  interface UserMapper{
	//�û�
		//�����û�
		public int ysave(user yong);
		//��ѯ�û����Ƿ��ظ���
		public int ychong(Integer UserID);
		//�ж��û����������Ƿ���ȷ
		public int getcun(user yong);//ok
		//������Ϣ��ϸ��
		public List<duser> allgeren(Integer UserID);
		
				
		
	//��������
		//�������Ų�ѯ��ͨ������id����ѯ�����˷�������������
		public List<news> fabu(news news);
		//��������
		public int znews(news news);
		//ɾ������
		public int snews(Integer NewsID);
		//�޸�����
		public int xnews(news news);
		
		public List<news> xfabu(Integer NewsID);

		
	
	//�������
		//����������Ų�ѯ
		public List<news> shenhe(news news);
		//�����ϸ���Ų�ѯ
		public String shennews(Integer NewsID);
		//�޸��������ֵ
		public int xfile(news news);
		
		
		
	//ϵͳ����
		//ɾ������
		public int suser(Integer UserID);
		//�޸ĸ���,һ��id��һ��type
		public int xuser(user user);
		//��ѯ�����û�
		public List<user> getgeren(user user);
		
		
	//ǰ̨��ҳ
		//ǰ̨��ѯ������ϸ����
		public List<news> biaoti(String NewsTitle);
		
		
		
				public List<user> getgeren(String UserID);
				// ��ѯȫ���û���Ϣ
				public List<huo> getgehuo(String wyid);
				
				// ���һ���û���Ϣ	
				public int save(huo huo);
				
				// ɾ��һ���û���Ϣ
				public int delete(Integer wid);
				
				// �޸�һ���û���Ϣ
				public int update(huo huo);
				

			
			//����
				public List<huo> gethuo();
				
				public int buysave(ding ding);
				
				public String buyname(Integer wid);
			//����
				
				public List<ding> getding(String dbuy);
	
}
