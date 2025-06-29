public class GoogleDrive extends GoogleAccount
{
	int photos;
	int videos;
	int docs;
	int audio;
	int bin;
	
	public GoogleDrive() {}
	
	public GoogleDrive(String name,long phno,String email,String pass)
	{
		super(name,phno,email,pass);
	}
	
	public void add(String type)
	{
		switch(type.toUpperCase())
		{
		 case "PHOTOS":
		 case "PHOTO":
			 photos++;
			 System.out.println("Photo added successfully!");
			 break;
			 
		 case "VIDEOS":
		 case "VIDEO":
			 videos++;
			 System.out.println("Video added successfully!");
			 break;
			 
		 case "DOCS":
		 case "DOC":
			 docs++;
			 System.out.println("Document added successfully!");
			 break;
			 
		 case "AUDIOS":
		 case "AUDIO":
			 audio++;
			 System.out.println("Audio added successfully!");
			 break;
			 
		 default:
			 System.out.println("Invalid filetype!");
		}
	}
		
		public void delete(String type)
		{
			bin++;
			
			switch(type.toUpperCase())
			{
			 case "PHOTOS":
			 case "PHOTO":
				 photos--;
				 System.out.println("Photo deleted successfully!");
				 break;
				 
			 case "VIDEOS":
			 case "VIDEO":
				 videos--;
				 System.out.println("Video deleted successfully!");
				 break;
				 
			 case "DOCS":
			 case "DOC":
				 docs--;
				 System.out.println("Document deleted successfully!");
				 break;
				 
			 case "AUDIOS":
			 case "AUDIO":
				 audio--;
				 System.out.println("Audio deleted successfully!");
				 break;
				 
			 default:
				 bin--;
				 System.out.println("Invalid filetype!");
			}
		
	    }
		
	public void displayGoogleDrive()
	{
		System.out.println();
		displayGoogleAccount();
		System.out.println("No of photos: "+photos);
		System.out.println("No of videos: "+videos);
		System.out.println("No of documents: "+docs);
		System.out.println("No of audios: "+audio);
		System.out.println("Recycle bin: "+bin);
		System.out.println("-------------------------------");
		
	}
	
}