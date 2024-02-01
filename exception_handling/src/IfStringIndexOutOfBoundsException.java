
public class IfStringIndexOutOfBoundsException {
	
	public static void main(String[] args) {
		
		String logoFilePath = "/Users/seunghun/images/logo.png";
		
		
		/*
		 * logoFilePath 인스턴스에서 logo.png만 추출해 출력해보세요. 
		 */
		int pathLastIndex = logoFilePath.lastIndexOf("/");
		String png = logoFilePath.substring(pathLastIndex + 1);
		System.out.println(png);
		
		
		/*
		 * logoFilePath 인스턴스에서 "images"만 추출해 출력해보세요. 
		 */
		int pathStsrtIndex = logoFilePath.indexOf("/");
		String images = logoFilePath.substring(pathStsrtIndex + 1, pathLastIndex);
		System.out.println(images);
		
		
		/*
		 * logoFilePath 인스턴스에서 "user_images"만 추출해 출력해보세요. 
		 */
		
		//user_images가 있으면 출력하고, 아니면 동작을 안함
		if(logoFilePath.contains("user_images")) {
			int pathStartIndex1 = logoFilePath.indexOf("user_images");
			
			String user_images = logoFilePath.substring(pathStartIndex1, pathLastIndex);
			System.out.println(user_images);
		}
		
		
		/*
		 * logoFilePath 인스턴스에서 확장자("png")만 추출해 출력해보세요. 
		 */
		int dotIndex = logoFilePath.indexOf(".") + 1;
		String dot = logoFilePath.substring(dotIndex);
		System.out.println(dot);
		
		
		/*
		 * downloadFilePath 인스턴스에서 파일의 확장자를 추출해 출력해보세요. 
		 */
		
		String downloadFilePath = "/Users/seunghun/logo";
		// .이 있으면 잘라서 출력하고, 아니면 동작을 안함
		if(downloadFilePath.contains(".")) {
			int extensionIndex = downloadFilePath.indexOf(".") + 1;
			String extension = logoFilePath.substring(extensionIndex);
			System.out.println(extension);
		}
		
		
		
		
		
	}
	
}
