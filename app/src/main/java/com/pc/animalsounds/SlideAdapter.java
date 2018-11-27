package com.pc.animalsounds;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SlideAdapter extends PagerAdapter {

    public int[] listImages = {
            R.drawable.ayi,
            R.drawable.fil,
            R.drawable.horoz,
            R.drawable.sincap,
            R.drawable.ordek,
            R.drawable.inekpngg,
            R.drawable.kartal,
            R.drawable.at,
            R.drawable.kaplan,
            R.drawable.gergedan,
            R.drawable.baykus,
            R.drawable.deve,
            R.drawable.yilan,
            R.drawable.kurbaga,
            R.drawable.geyik,
            R.drawable.aslan,
            R.drawable.marti,
            R.drawable.kopek,
            R.drawable.kedi,
            R.drawable.penguen,
            R.drawable.koyun,

    };
    public String[] listTitle = {

            "Ayı",
            "Fil",
            "Horoz",
            "Sincap",
            "Ördek",
            "İnek",
            "Kartal",
            "At",
            "Kaplan",
            "Gergedan",
            "Baykus",
            "Deve",
            "Yılan",
            "Kurbağa",
            "Geyik",
            "Aslan",
            "Martı",
            "Köpek",
            "Kedi",
            "Penguen",
            "Koyun"
    };
    public String[] listAciklama = {

            "Ayılar tıknaz gövdeleri, kalın kürkleri ve büyük pençeleriyle, iri ve güçlü memelilerdir. Avrupa, Asya ve Kuzey Amerika başta olmak üzere, yaşayan yedi tür ayı bulunmaktadır.\n" +
                    "\n" +
                    "Ayıların büyük bir bölümü için et temel gıdadır. Ayılar etobur sınıfına girerler, ancak; meyveler, kabuklu yemişler, balık ve bal başta olmak üzere,her şeyi yiyebilirler. Ufak gözleri iyi bir görüş sağlamasa da; güçlü koku alma duyularını kullanarak yiyeceklerini bulurlar.",
            "Fil karada yaşayan havvanların en büyüğü ve en ağırıdır. Hortumlu memelilerdendir. Yükseklikleri yerden 4-5 metre, ağırlıkları da 4-5 ton kadardır. Üst dudakla burun birleşerek uzamış/ kalın kuvvetli bir hortum şekline girmiştir.\n" +
                    "\n" +
                    "Fil, Afrika ve Asya’nın sıcak bölgelerinde yaşar. Bugün için yeryüzünde iki çeşit fil vardır: Afrika ve Asya fili. Bazı bilginler Sumatra ve Borneo adalarında yaşayan, boyca daha küçük bir fil cinsini üçüncü çeşit olarak gösterirler.",
            "Tavuğun erkeğidir. İbiğinin iriliği, kuyruklarının uzunluğu ile tavuktan ayrılır.\n" +
                    "\n" +
                    "Horoz oldukça dövüşçü bir hayvandır; bundan dolayı, horozları dövüştürmek birçok kimseler için heyecan verici bir oyun olmuştur.\n" +
                    "\n" +
                    "Horoz dövüşü çok eski çağlardan beri bilinir. Eski Çin’de, Roma’da, Yunanistan’da horoz dövüşleri yapılırdı. Bugün, daha çok Güney Amerika memleketlerinde, Meksika’da, Filipinler’de, Antiller’de horoz dövüşü çok yaygın bir eğlencedir. Dövüştürülecek horozlar özel olarak beslenip yetiştirilir. Dövüş bittikten sonra üç dakika ayakta kalabilen horoz dövüşü kazanmış sayılır.",
            "Sincap, Sincapgiller yani Sciuirade familyasına dahil olan uzun kuyruklu ve kemirici yapıda bir memelidir. Sincabın yöreden yöreye değişen halk arasında farklı söylemleri bulunmaktadır. Bu söylemlerden en çok bilineni de çekelezdir. Eski Türkçede ise sincaplara, teyin, deyin ve değin dendiği bilinmektedir. Sincap yabani hayvanlar arasında en sevecen türlerden olanlarıdır. Olağan dışı durumlar haricinde sincapların herhangi bir saldırıda bulunduğu veya vahşi tavırlar sergilediği görülmemektedir.",
            "Ördek; Perdeayaklı kuşlardan bir kümes hayvanıdır. Kazdan küçüktür. Ördeğin etinden, yumurtasından faydalanılır. Daha çok sulak yerlerde beslenir. Evcili olduğu gibi sürüler halinde başıboş bir şekilde yaşayan yabanileri de vardır.",
            "Evcil olarak dünyânın her tarafında yetiştirilir. Özellikleri: Mideleri dört gözlüdür. Geviş getirir. Et ve sütü için beslenir. Ömrü: 20-25 yıldır. Çeşitleri: Friz (Holstein), Jersey, Simental, Montafon, Plevne ırkı, Silifke ırkı en çok bilinen süt inekleridir.\n" +
                    "\n" +
                    "Ergin dişi sığırlara verilen ad. Boğanın dişisi olarak da bilinir. Karnının altında iki arka bacağı arasında iri memeleri vardır. Otla beslenir. Midesi dört gözlüdür. Geviş getirir. Boynuzları dâimî olduğundan kırılınca yenisi çıkmaz. Bütün sığırlar gibi üst kesici dişleri bulunmadığından otu alt çene dişleriyle keser. Günde 70 kg kadar ot yer. Sütünden, etinden, deri ve gübresinden faydalanılır. Yük ve çekim hayvanı olarak da kullanıldığı yerler vardır. Evcil olarak insanın bulunduğu her yerde beslenir. Geceleri ahırlarda barındırılır. Otlak hayvanı olduklarından gündüzleri mer'alara salınır.",
            "Yırtıcı kuşların en büyüğüdür. Kanat boylarıyla 2.5 metreyi bulmaktadır. Hayatları boyunca tek eşlidirler ve sadece bir yuva kullanırlar. Kuşlar arasında gökyüzünde en yüksekte uçan kuş kartaldır. Yumurtadan çıkan yavrulardan en büyüğü genellikle diğerlerini yiyerek hayatta kalır ve bunu annesinin gözü önünde yapar. Dişi kel kartallar erkeklere göre % 25 daha büyüktür. Yuvalarını yükseklere ve ulaşılması zor olan yerlere yaparlar. Kartallar 40 yaşına geldiklerinde gagaları, tüyleri ve pençeleri sertleşir. Bu durumdan rahatsız olan kartal ya kendisini öldürür ya da gagasını kırarak ve tüyünü yolarak yenilerini çıkartarak hayatta kalmayı seçer. 60 kadar kartal türü vardır. Çok yüksekte uçmalarına rağmen gözleri çok iyi derecede görür.",
            "At, hayvanlar içinde, insanların en eski dostudur. Yeryüzünün hemen her yerinde yaşar. Genel olarak ikiye ayrılırlar:\n" +
                    "1) Sıcakkanlı atlar (Doğu atları);\n" +
                    "2) Soğukkanlı atlar (Batı atları).\n" +
                    "\n" +
                    "Arap atları, İngiliz atları sıcakkanlı atlardandır. Atın erkeğine aygır, dişisine kısrak, yeni doğmuş yavrusuna kulun, büyümüş yavrusuna da tay denir. Ata rengini veren tüylere atın donu denir. Yağız, al, doru, kula, kır, boz gibi türlü at donları vardır.\n" +
                    "\n" +
                    "At özenli bakım isteyen bir hayvandır. Genellikle, üçüncü yaşının sonunda ergin hale gelir. îtimi sıcakkanlı atlarda, erginlik daha erken olur. Kısraklar genellikle 3 yaşında aygıra gösterilirler. Erkek atlar da üç yaşından 20-25 yaşına kadar aygırlık yapabilirler. Damızlıklarda bu süre daha kısadır.",
            "Kaplan; Yırtıcı dörtayaklılardan, kedi cinsinde, aslan iriliğinde, ondan daha çevik, daha saldırıcı bir hayvandır. Kaplanlar en çok Asya’nın sıcak bölgelerinde, Hindistan’da, da, Türkistan’da, İran’da, Çin’de, Japonya’da, Cava’da ve Sumatra’da rastlanır. Kaplan yalnız Asya’ da bulunur.\n" +
                    "\n" +
                    "Kaplan, İrilik, kemik yapısı, dişler, tırnaklar bakımından aslana çok benzer. Kaplanın postu, aslanınki gibi düz renk değildir. Açık sarıya bakan kahverengi üzerine siyah, beyaz çizgilidir. Erkek kaplanlar genel olarak 200-250, dişiler 150-160 kilo ağırlıkta olur. Kaplanın ömrü ortalama 20-25 yıl kadardır. Soğuk yörelerde yaşayan kaplanların postları, sıcak bölgelerde yaşayanlarınkinden daha sık, uzun kalın tüylüdür. Kuzey Çin’de, postunda beyaz üzerine açık kahverengi yollar olan değişik bir kaplan cinsi yaşar.",
            "Gergedan (Lat. Rhinoceros); Gergedangiller familyasına giren hayvanlara verilen genel addır. Boyları 2-4 m, yükseklikleri 2 m, ağırlıkları ise 1-2 ton kadar olabilir. Hemen hemen tüysüz olan derisi 6 cm ‘ye ulaşan kalınlığıyla zırh biçimini almıştır. Koku alma ve işitme duyuları gelişmiş olduğundan 40-50 km’lik hızla hareket edebilirse de, ancak 30 m kadar uzağı görebilen görme duyuları gelişmemiştir. En belirgin özellikleri olan boynuzları, burun kemiğinin üzerinde yer alır. Herhangi bir nedenle düşse bile yapısını oluşturan kemiksi lifler aracılığıyla kısa sürede yeniden çıkar. Fundalık yerlerde yalnız yaşarlar. Otla beslenir, geviş getirmez. Ortalama ömürleri 50 yıl olup, tekeşli yaşam sürerler. Yaklaşık 500 gün süren gebelik döneminin ardından yalnızca bir yavru doğururlar. 2 yıl kadar ana sütüyle beslenen yavru, 4-5 yılda erginleşir. Bu familyaya ait türler 2 alt familyada toplanır.",
            "Baykuş, Strigiformes (gece yırtıcıları) takımından gece avlanan yırtıcı kuş türlerine verilen ad. \n" +
                    "\n" +
                    "Başları büyük ve tüylüdür. Kuyrukları kısa olmakla beraber, kanatları enli ve uzundur. Bir kısmının kanat açıklığı, bir adam boyuna ulaşır. Serçe kadar küçük olanları da vardır. Gagaları kıvrık, pençeleri keskin kanca tırnaklı ve döner parmaklıdır. Kuvvetli pençeleri adeta avına kenetlenir. ",
            "Deve; (Lat. Camelus). Devegiller familyasından geviş getiren memeli hayvandır. Afrika, Asya ve Amerika’nın çöllük bölgelerinde yaşar. Uzun yay biçimli boynu, yarık üst dudakları, öteki geviş getirenlerde görülmeyen üst kesici dişleri, sırt bölümündeki hörgüçleriyle geniş, yastıklı ve iki parmaklı ayakları en belirgin özellikleridir.",
            "ılanlar ince-uzun vücutlu, ayaksız yaratıklardır. Türlü uzunlukta, pek çok çeşitleri vardır. Yılanın vücudu baş, gövde, kuyruk olmak üzere üç bölümden meydana gelmişse de, ilk bakışta gövdeyle kuyruk kolay kolay ayırdedilemez.\n" +
                    "\n" +
                    "Yılanın başı üçgen biçimindedir. Gözleri kapaksızdır; gözün önünde saydamlaşmış bir deri vardır. Bu tabaka gözü korumaya yarar.\n" +
                    "\n" +
                    "Yılanın dilinin ucu çatallıdır. Alt çenesi öbür hayvanlarınkinden daha çok açılabilir. Bu sayede, yılan kendinden daha büyük hayvanları bile kolayca yutabilir. Ağzında sivri dişler varsa da, bunlar çiğnemeye yaramaz. Damağında ayrıca çengel biçiminde iki tane de zehir dişi vardır. Bu dişin ortasındaki kanaldan zehir fışkırır.",
            "Kurbağalar, Omurgalılar’ın 4. alt şubesini meydana getirirler. Bunlar hem karada, hem de suda yaşayabilen hayvanlardır. Yalnız, tatlı sularda — derelerde, göl kıyılarında, bataklıklarda — yaşarlar; denizde yaşayamazlar.\n" +
                    "\n" +
                    "Kurbağanın vücudu yumruk büyüklüğündedir; ince, tüysüz, ıslak bir deriyle kaplıdır. Sırtında kırmızımtırak, zeytin yeşili benekler vardır. Arka bacakları ön bacaklarından çok daha uzun, çok daha kuvvetlidir. Kurbağa, bunlar sayesinde, sıçraya sıçraya yol alır. Gözleri çok keskindir. Kurbağanın dili, ağzına ön ucundan yapışıktır, arkası serbesttir. Kurbağa ağzını açınca, dili büyük bir hızla dışarıya fırlar. Hayvan, bu sayede, yakınından geçen sinek, kelebek gibi küçük böcekleri kolayca yakalayabilir.",
            "Geyik (Lat. Cervus); Geyikgiller familyasından hayvanlara verilen genel addır. Ormanlık, tundra ve bozkırlarda yalnız ya da sürüler halinde yaşarlar. Yaşam süreleri 30 yıl kadar olup sürgün, tomurcuk, yaprak ya da otla beslenirler. Ürkek hayvanlardır. Çiftleşme dönemi olan sonbaharda erkek geyikler böğürtüleriyle çevreye topladıkları dişiler için dövüşürler. Geyiklerin örnek türü olan asıl geyik ya da adi geyik dünyanın her yerinde yaşar. Boyu 1.40 m, ağırlığı yaklaşık 150 kg kadardır. Çiftleşme dönemi dışında yalnız, yaşar.",
            "Memelilerin etoburlar familyasından yırtıcı bir hayvandır. Eskiden bütün Afrika’da, Güney ve Batı Asya’da, Güney Avrupa’da yaşardı. Bulunan taşıllara (fosillere) göre aslanın Orta Avrupa’da da yaşadığı anlaşılmıştır. Fakat ateşli silâhların çıkmasından sonra her vahşi hayvan gibi aslanın da yaşadığı yerler çok azalmıştır. Meselâ Filistin’de, Mısır’da hemen hemen hiç kalmamış gibidir. Aslan bugün ancak Orta Afrika’da, Orta ve Batı Hindistan’da yaşar.\n" +
                    "\n" +
                    "Aslanın vücudu, diğer kedi cinslerine göre daha kalın ve kısadır. Postu sarıya çalan külrengindedir, erkeğinin boynunda «yele» adı verilen uzun tüyler vardır. Gözleri yüzünün büyüklüğü yanında küçük kalır. Kuyruğunun ucundaki püskülün içinde bir tırnak vardır, bu tırnak sonradan düşer.",
            "Martı; (Lat. Larus). Martıgiller familyasından çeşitli su kuşlarının ortak adıdır. Ördek iriliğinde (25-65 cm), soluk külrengi ya da beyaz tüylü, uzun sivri kanatlı bir kuştur, eti yenmez. Türlerin çoğunda yalnız üreme mevsimlerinde başın ve boynun bir bölümü esmer ya da siyahımsı olur. Rahat ve sürekli uçabilir, suyun üstüne konar, az yüzer ancak suya dalmaz. Her türlü besini yer. Çeşitli hayvan leşleri ve balıklar başlıca besinidir. Genellikle bataklıklarda, durgun su ve deniz kenarlarında yuva yapar. Kış aylarında değişik yerlere göç eder. Haliçler, ırmaklar ve göller başlıca göç yerleridir. Dünyanın hemen her yerinde yaşar. Başlıca türleri: Gümüş martı, kara martı, güler martı, cüce martı.",
            "Köpek (Lat. Canis familiaris). Etçiller takımının Köpekgiller familyasından bir memeli hayvandır. Atası kurt ya da çakal olabilir, çünkü üçü birbirini dölleyebilir. Tilki de aynı familyadandır, ancak köpeğe çok yakın sayılmaz. Köpeğin ne zaman evcilleştirildiği belli değildi, ancak tarih öncesi dönemden beri evcil olduğu bilinmektedir. Dördüncü zaman oluşumlarında insan iskeletleri yanında köpek kemiklerine de rastlanmıştır. Eski Mısırlıların köpek mezarlıklarında da çeşitli köpeklerin (tazı, base, çeşitli finolar) kemikleri bulunmuştur.",
            "Kedi; (Lat. Felis). Etçiller takımının Kedigiller familyasından memeli hayvanlara verilen genel addır. Aynı adı taşıyan evcil hayvanlardan başka, kısa ve yuvarlak bir burun, çok güçlü çeneler, gizlenebilir tırnaklar gibi belirleyici özellikler taşıyan çok sayıda türü kapsar.\n" +
                    "\n" +
                    "Tarihte en önce evcilleştirilen hayvanlardan biridir. İÖ 300 yıllarına ait Eski Mısır kabartmalarında, heykellerinde ve çeşitli buluntularında kedi betimleri vardır. Ayrıca Eski Mısırlılar kediyi kutsal hayvan sayarlardı. Evcil kediler daha sonraki yüzyıllara Afrika’dan tüm dünyaya yayıldı. Fenikeliler Hristiyanlık öncesinde kedileri İtalya’ya getirdiler.",
            "Penguen; Spheniscidae familyasına giren, birçok türden iri uçamayan kuşlardır. Penguenler bacak kemiklerinin yerleşimi açısından tüm öteki kuşlardan ayrılırlar. Ayaklarında üçü perdeli olmak üzere 4 parmak vardır. Küçük kanatları, tüysüz ve düz, yüzmeye elverişlidir. Kuyruğu kısadır ve kuş dinlenirken vücut ağırlığının bir bölümünü taşır. Vücudu, tüy yataklarıyla kaplıdır, geriye kalan öteki kuşlardan farklı olarak katı kemiklerden oluşur. Kafası oldukça küçüktür. Gagası iyi gelişmiş, keskin ve güçlüdür. Dili boğaz yönüne bakan boynuzsu diken lamellerle kaplıdır. Güçlü ve hızlı bir yüzücüdür. Yalnızca güney yarımkürede yaşar. Antartika, Güney Avustralya, Güney Afrika, Güney Amerika ve Yeni Zelanda yaşam alanlarını oluşturur. Temel besinleri balıktır, ancak yumuşakçalar ve kabukluları da yer.",
            "Koyun; gevişgetirenlerden, eti, sütü, yapağısı, derisi için yetiştirilen evcil bir hayvandır. Koyun, insanların en çok faydalandığı hayvanlardan biridir. Koyunların yeryüzünde ilk olarak Orta Asya’nın yayla ve dağlarında insanlardan uzak ve yabani bir şekilde yaşamış oldukları sanılıyor. Bugün nesli hala tükenmemiş olan yabani koyunların en irisi, Altay Dağları’nda yaşayan argali cinsidir. Erkek argalilerin, omuzlarına kadar boyları 1 metre 20 santimi bulur. Bu hayvanların, büyük bir daire meydana getirerek geriye doğru kıvrılmış kalın boynuzlan vardır."
    };
    public int[] listBackground = {

            Color.rgb(55, 55, 55),
            Color.rgb(239, 85, 85),
            Color.rgb(55, 55, 55),
            Color.rgb(152, 245, 255),
            Color.rgb(112, 128, 144),
            Color.rgb(55, 55, 55),
            Color.rgb(240, 255, 255),
            Color.rgb(55, 55, 55),
            Color.rgb(245, 245, 245),
            Color.rgb(192, 192, 192),
            Color.rgb(245, 245, 245),
            Color.rgb(255, 239, 213),
            Color.rgb(255, 250, 240),
            Color.rgb(224, 255, 255),
            Color.rgb(32, 178, 170),
            Color.rgb(255, 255, 255),
            Color.rgb(240, 255, 255),
            Color.rgb(175, 238, 238),
            Color.rgb(70, 130, 180),
            Color.rgb(250, 250, 210),
            Color.rgb(245, 255, 250),

    };
    Context context;
    LayoutInflater layoutInflater;


    public SlideAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return listTitle.length;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
        ShowingSlider.player.stop();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide, container, false);
        try {
            LinearLayout linearLayoutSlide = (LinearLayout) view.findViewById(R.id.lnrSlider);
            ImageView imageViewSlide = (ImageView) view.findViewById(R.id.slideImageView);
            TextView txtBaslik = (TextView) view.findViewById(R.id.txtBaslik);
            TextView txtAciklama = (TextView) view.findViewById(R.id.txtBilgiAlani);
            imageViewSlide.setImageResource(listImages[position]);
            linearLayoutSlide.setBackgroundColor(listBackground[position]);
            txtBaslik.setText(listTitle[position]);
            txtAciklama.setText(listAciklama[position]);
            Events(linearLayoutSlide, position);
            ShowingSlider.player.stop();
            container.addView(view);
        } catch (Exception ex) {
            Toast.makeText(context, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
        return view;
    }


    public void Events(LinearLayout lnrAnimal, final int position) {
        try {
            lnrAnimal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PlaySound(position);
                }
            });


        } catch (Exception ex) {
            Toast.makeText(context, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void PlaySound(int position) {
        try {
            ShowingSlider.player = new MediaPlayer();
            if (ShowingSlider.player.isPlaying())
                ShowingSlider.player.stop();

            AssetFileDescriptor assetFileDescriptor = null;
            if (position == 0) {
                assetFileDescriptor = context.getAssets().openFd("AyiSesi.mp3");
            } else if (position == 1) {
                assetFileDescriptor = context.getAssets().openFd("FilSesi.mp3");
            } else if (position == 2) {
                assetFileDescriptor = context.getAssets().openFd("horoz.mp3");
            } else if (position == 3) {
                assetFileDescriptor = context.getAssets().openFd("SincapSesi.mp3");
            } else if (position == 4) {
                assetFileDescriptor = context.getAssets().openFd("OrdekSesi.mp3");
            } else if (position == 5) {
                assetFileDescriptor = context.getAssets().openFd("inek.mp3");
            } else if (position == 6) {
                assetFileDescriptor = context.getAssets().openFd("KartalSesi.mp3");
            } else if (position == 7) {
                assetFileDescriptor = context.getAssets().openFd("AtSesi.mp3");
            } else if (position == 8) {
                assetFileDescriptor = context.getAssets().openFd("KaplanSesi.mp3");
            } else if (position == 9) {
                assetFileDescriptor = context.getAssets().openFd("GergedanSesi.mp3");
            } else if (position == 10) {
                assetFileDescriptor = context.getAssets().openFd("BaykusSesi.mp3");
            } else if (position == 11) {
                assetFileDescriptor = context.getAssets().openFd("DeveSesi.mp3");
            } else if (position == 12) {
                assetFileDescriptor = context.getAssets().openFd("YilanSesi.mp3");
            } else if (position == 13) {
                assetFileDescriptor = context.getAssets().openFd("KurbagaSesi.mp3");
            } else if (position == 14) {
                assetFileDescriptor = context.getAssets().openFd("GeyikSesi.mp3");
            } else if (position == 15) {
                assetFileDescriptor = context.getAssets().openFd("AslanSesi.mp3");
            } else if (position == 16) {
                assetFileDescriptor = context.getAssets().openFd("MartiSesi.mp3");
            } else if (position == 17) {
                assetFileDescriptor = context.getAssets().openFd("KopekSesi.mp3");
            } else if (position == 18) {
                assetFileDescriptor = context.getAssets().openFd("KediSesi.mp3");
            } else if (position == 19) {
                assetFileDescriptor = context.getAssets().openFd("PenguenSesi.mp3");
            } else if (position == 20) {
                assetFileDescriptor = context.getAssets().openFd("KoyunSesi.mp3");
            }

            ShowingSlider.player.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            ShowingSlider.player.prepare();
            ShowingSlider.player.start();
        } catch (Exception ex) {
            Toast.makeText(context, ex.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }

}
