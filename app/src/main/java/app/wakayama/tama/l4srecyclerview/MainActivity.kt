package app.wakayama.tama.l4srecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val GudeData: List<GudeData> = listOf(
        GudeData(R.drawable.g1,"スケルトンたまご", "たまごを酢に2日間つけると、殻が透ける"),
        GudeData(R.drawable.g2,"カラシュート", "殻をパラシュートにしてゆっくり落ちてくる"),
        GudeData(R.drawable.g3,"ラップぐでたま", "ラップを歌う時は珍しくハキハキしゃべる"),
        GudeData(R.drawable.g4,"プンプンぐでたま", "せっかく寝かかっているときに起こされて機嫌をそこねている"),
        GudeData(R.drawable.g5,"メレンゲぐでたま", "だんだんメレンゲが廃れていく"),
        GudeData(R.drawable.g6,"変顔たまごVer2", "さらなる面白顔を目指して自分の顔をいじくりたおすぐでたま"),
        GudeData(R.drawable.g7,"シースルーぐでたま", "透き通った卵白を通して経済の行く末を見守っていると見せかけて、実際はなにも考えていない"),
        GudeData(R.drawable.g8,"くろみつかき氷", "黒蜜をかけたかき氷に乗ったみたぐでたま。おなかがヒンヤリして気持ちいいらしい"),
        GudeData(R.drawable.g9,"家庭的なぐでたま", "なんだか家庭的な印象を受けるぐでたま"),
        GudeData(R.drawable.g10,"パソコンたまご（SNS）", "SNSでみんなと繋がるぐでたま。情報社会って大変！"),
        GudeData(R.drawable.g11,"解放されたぐでたま", "海苔から解放された卵寿司。ちょっとでもズレるとお米がくずれそう"),
        GudeData(R.drawable.g12,"チョコエッグ", "別に卵ではない")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter= adapter

        adapter.addAll(GudeData)
    }
}