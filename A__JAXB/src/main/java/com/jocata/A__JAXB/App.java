package com.jocata.A__JAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.jocata.A__JAXB.model.OfflinePaperlessKyc;

public class App 
{
    
	public static void main(String[] args) 
	{
		try 
		{
			File file = new File("C:\\lekha_data\\Kyc1.xml");
			 
			JAXBContext jaxbContext = JAXBContext.newInstance(OfflinePaperlessKyc.class);
				
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				
			OfflinePaperlessKyc kyc = (OfflinePaperlessKyc) unmarshaller.unmarshal(file);

			System.out.println(kyc.getReferenceId());

			System.out.println(kyc.getUidData().getPoi());
			System.out.println(kyc.getUidData().getPoa());
			System.out.println(kyc.getUidData().getPht());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
