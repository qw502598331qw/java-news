package com.service;

import java.util.List;
import com.model.ding;
import com.model.duser;
import com.model.huo;
import com.model.news;
import com.model.user;

public interface IUserService {
	
	//�û�
				//����û���Ϣ����Ҫyonghu4������
				public boolean yadd(user yong);	
				//�ж��Ƿ�����
				public boolean ychong(Integer UserID);
				//�ж��û����������Ƿ���ȷ
				public boolean cun(user yong);//ok		
				//������Ϣ��ϸ��
				public List<duser> allgeren(Integer UserID);
			
	//��������
				//�������Ų�ѯ
				public List<news> fabu(news news);
				//��������
				public boolean znews(news news);
				//ɾ������
				public boolean snews(Integer NewsID);
				//�޸�����
				public boolean xnews(news news);
				//ͨ��id������޸�����
				public List<news> xfabu(Integer NewsID);
	//�������
				//����������Ų�ѯ
				public List<news> shenhe(news news);
				//�����ϸ���Ų�ѯ
				public String shennews(Integer NewsID);
				//�޸��������ֵ
				public boolean xfile(news news);
				
	//ϵͳ����
					//ɾ������
					public boolean suser(Integer UserID);
					//�޸ĸ���,һ��id��һ��type
					public boolean xuser(user user);
					//��ѯ�����û�
					public List<user> getgeren(user user);
					
	//ǰ̨
					//ǰ̨��ѯ������ϸ����
					public List<news> biaoti(String NewsTitle);
					
	
	
	//����
	// ��ӻ�����Ϣ����Ҫ����huo����6������
	public boolean add(huo huo);
	
	// ɾ��������Ϣ����Ҫwid
	public boolean delete(Integer wid);

	// �޸Ļ�����Ϣ����Ҫ�޸�huo6������
	public boolean update(huo huo);

	//��ѯ�����û���Ϣ����Ҫyid
	public List<user> yonghuqueryAll(String yid);
	
	//��ѯ���еĻ���
	public List<huo> huoqueryAll();
	
	//��ѯ���˷����Ļ����Ҫyid
	public List<huo> gehuoqueryAll(String wyid);
	
	//��ѯ���˶�������Ҫyid
	public List<ding> dingqueryAll(String dbuy);

	
	
	//����
	//��ù����������֣���Ҫ�����wid
	public String buyname (Integer wid);
	
	//��ӹ������Ķ�������Ҫding��������
	public boolean buyadd(ding ding);
	
	

}
