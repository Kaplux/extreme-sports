package fr.mildlyusefulsoftware.extremesports.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import fr.mildlyusefulsoftware.imageviewer.service.DatabaseHelper;
import fr.mildlyusefulsoftware.imageviewer.service.Picture;

public class ViewPictureActivity extends fr.mildlyusefulsoftware.imageviewer.activity.ViewPictureActivity {

	@Override
	protected String getAdMobId() {
		return "a1500aadf544474";
	}

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	//	putNewPictures();
	}
	
	private void putNewPictures(){
		String[] url =new String[]{
				"http://www.europeword.com/blog/wp-content/uploads/European-extreme-sports.jpg",
				"http://babaloud.com/wp-content/uploads/2010/09/SKYDIVING.jpg",
				"http://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Ice_Climbing.jpg/400px-Ice_Climbing.jpg",
				"http://www.desktop-xp.com/images/freeextremesports/big2.jpg",
				"http://www.moolf.com/images/stories/Sport/Dangerous-Extreme-Sports/Most-Dangerous-Extreme-Sports.jpg",
				"http://www.imagesu.net/data/media/11/extreme_sports_alpine_skiing_1_2.jpg",
				"http://www.eukicks.com/wp-content/uploads/2008/05/dsc_7938.jpg",
				"http://realitypod.com/wp-content/uploads/2010/09/extreme-sports-photography1.jpg",
				"http://www.clipmass.com/thumb/278/1_277797.jpg",
				"http://1.bp.blogspot.com/-WrWtuZt-N4k/TfYR4vORvBI/AAAAAAAAAME/9hFqug7zUyI/s1600/tn_sports_2016.jpg",
				"http://www.hotelclub.com/blog/wp-content/uploads/2009/08/extreme-sports.jpg",
				"http://4.bp.blogspot.com/_GQrNR2iABwc/S_QM-d7oQVI/AAAAAAAAYHA/cxEp6q7JopU/s1600/thrilling_extreme_07.jpg",
				"http://www.armytimes.com/xml/news/2009/07/ap_extreme_sports_072809/072809_extreme_sports_800.JPG",
				"http://1.bp.blogspot.com/-Jr_NwI_aqlY/TmdeHBIC5WI/AAAAAAAAAZA/QIXTpcG463E/s1600/extreme+sports+wallpapers1.jpg",
				"http://www.agoride.com/img/ex/img_contenu/000268/026766_g.jpg",
				"http://www.deshow.net/d/file/sports/2009-01/winter-skiing-367-2.jpg",
				"http://imgs.mi9.com/uploads/sports/2553/extreme-sports-wallpaper_1024x768_34851.jpg",
				"http://www.posters.ws/images/349510/extreme_sports_kayaking.jpg",
				"http://www.imagesu.net/data/media/11/extreme_sports_wallpaper_1024x768_34849.jpg",
				"http://www.barcelonaconnect.com/Images/events/EventPic_1583.jpg",
				"http://files.fbstatic.com/PostImages/335966/0/cd646e71-f9f9-4ac0-920f-56dbfbd90e4a.jpg",
				"http://imgs.mi9.com/uploads/sports/2553/extreme-sports-wallpaper_1024x768_34848.jpg",
				"http://www.agoride.com/img/ex/img_contenu/000240/023916_g.jpg",
				//"http://healthypeople-2020.com/wp-content/uploads/2012/01/Healthy-People-Extremesports.jpg",
				"http://imgs.mi9.com/uploads/sports/2553/extreme-sports-wallpaper_1024x768_34872.jpg",
				"http://images2.fanpop.com/images/photos/2800000/Gonzo-moto-x2-N-A-S-S-extreme-sports-2866037-800-588.jpg",
				"http://greatextremesports.com/gallery/2009/8/17/Extreme_Sports_Picture__S4V7K3.jpg",
				"http://www.9freepictures.com/d/file/sports-photography/200907/extreme-sports-surfing-12-2.jpg",
				"http://www.agoride.com/img/ex/img_contenu/000263/026221_g.jpg",
				"http://www.agoride.com/media/users/7926/7/articles/reims/47c03f9d33ac8498917da0110c2ce7f4.jpg",
				"http://www.tuxboard.com/photos/2011/09/Video-Compilation-Sport-Extreme.jpg",
				"http://ndaeuro.org/2009/ducoux/images/steep_ski.jpg",
				"http://www.agoride.com/media/users/7926/7/articles/05eff636579f1146847c8037bbf6f406.jpg",
				"http://www.onlinetravelcover.com/Images/extreme_sports_climber.jpg",
				"http://www.posters.ws/images/350891/extreme_sports_free_fall.jpg",
				"http://www.arnottslodge.com/images/Windsurfing.jpg",
				"http://www.imagewa.net/img/free-wallpapers/preview/201104/07/extreme-sports-wallpaper-006.jpg",
				"http://www.agoride.com/img/ex/img_contenu/000242/024150_g.jpg",
				"http://www.nationalgeographic.com/adventure/images/02_06/ice_climbing_gallery/ice_climbing1.jpg",
				"http://www.agoride.com/media/users/7926/7/articles/6be7ed26f67c5e5acd5a21623a0199e7.jpg",
				"http://www.tuxboard.com/photos/2011/09/Video-Compilation-Sports-Extremes-ski.jpg",
				"http://www.wallpapersfreedownload.info/images/wmwallpapers/extreme-sports_5-1.jpeg",
				"http://www.9freepictures.com/d/file/sports-photography/200908/winter-skiing-extreme-sports-97-8.jpg",
				"http://img.xcitefun.net/users/2009/03/34544,xcitefun-1.jpg",
				"http://www.besportier.com/archives/top-10-action-extreme-sports-athletes-list.jpg",
				
				
				
		};
		int i=40;
		List<Picture> pictures=new ArrayList<Picture>();
		for (int j=0;j<url.length;j++){
			try {
				Log.i("extremesports",url[j]);
				Picture p = new Picture(j+i, url[j],Picture.getPictureThumbnail(url[j]));
				pictures.add(p);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		DatabaseHelper.connect(this).putPictures(pictures);
	}


}
