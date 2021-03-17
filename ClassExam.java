package CTF01.Java.part2.No9_2;

public class ClassExam
{
//	Lab 2: ทดลองออ�?�?บบ�?ารสืบทอดของ Class
//	- จงสร้าง class ชื่อ MobilePhone เป็น Class �?ม่ที่อยู่บนสุด �?านที่สุด
//	โดย MobilePhone มี Feature ดังนี้
//		- MobilePhone -> PhoneCall(), SMS(), InternetSurfing()
//	- มีโทรศัพท์มือถืออยู่ 4 รุ่น มี Feature (method) ต่างๆ ดังนี้
//		- SamSung Galaxy Note 8 -> UseGearVR(),
//		  TransformToPC(), UsePen(), GooglePlay()
//		- iPhoneX -> FaceID(), AppStore()
//		- iPhone8 -> TouchID(), AppStore()
//		- Samsung Galaxy S8 -> UseGearVR(), TransformToPC(),
//		  GooglePlay()
//	- จงออ�?�?บบ class ให้�?ับมือถือทั้ง 4 รุ่น เพื่อให้เ�?ิด�?าร reuse �?บบ
//	  inheritance ให้มา�?ที่สุด (ใช้ extend)
	
	public static void main (String[] args) {
		SamsungGalaxyNote8 note8 = new SamsungGalaxyNote8();
		note8.UsePen();
		note8.PhoneCall();
		iPhoneX ix = new iPhoneX();
		ix.FaceID();
		ix.SMS();
		iPhone8 i8 = new iPhone8();
		i8.TouchID();
		i8.InternetSurfing();
		SamsungGalaxyS8 s8 = new SamsungGalaxyS8();
		s8.GooglePlay();
		s8.TransformToPC();
		s8.UseGearVR();
	}
	
}
