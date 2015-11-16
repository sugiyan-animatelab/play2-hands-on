
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object list_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Seq[models.Tables.UsersRow],play.twirl.api.HtmlFormat.Appendable] {

  /* このテンプレートの引数 */
  def apply/*2.2*/(users: Seq[models.Tables.UsersRow]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.38*/("""

"""),format.raw/*4.27*/("""
"""),_display_(/*5.2*/main("ユーザ一覧")/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""

"""),format.raw/*7.1*/("""<div>
    <a href=""""),_display_(/*8.15*/routes/*8.21*/.UserController.edit()),format.raw/*8.43*/("""" class="btn btn-success" role="button">新規作成</a>
</div>

<div class="col-xs-6">
    <table class="table table-hover">
        <thead>
        <tr>
            <th>ID</th>
            <th>名前</th>
            <th>&nbsp;</th>
        </tr>
        </thead>
        <tbody>
        """),format.raw/*21.28*/("""
        """),_display_(/*22.10*/users/*22.15*/.map/*22.19*/ { user =>_display_(Seq[Any](format.raw/*22.29*/("""
        """),format.raw/*23.9*/("""<tr>
            <td>"""),_display_(/*24.18*/user/*24.22*/.id),format.raw/*24.25*/("""</td>
            <td><a href=""""),_display_(/*25.27*/routes/*25.33*/.UserController.edit(Some(user.id))),format.raw/*25.68*/("""">"""),_display_(/*25.71*/user/*25.75*/.name),format.raw/*25.80*/("""</a></td>
            <td>"""),_display_(/*26.18*/helper/*26.24*/.form(routes.UserController.remove(user.id))/*26.68*/{_display_(Seq[Any](format.raw/*26.69*/("""
                """),format.raw/*27.17*/("""<input type="submit" value="削除" class="btn btn-danger btn-xs"/>
                """)))}),format.raw/*28.18*/("""
            """),format.raw/*29.13*/("""</td>
        </tr>
        """)))}),format.raw/*31.10*/("""
        """),format.raw/*32.9*/("""</tbody>
    </table>
</div>

""")))}))
      }
    }
  }

  def render(users:Seq[models.Tables.UsersRow]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((Seq[models.Tables.UsersRow]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


}

/* このテンプレートの引数 */
object list extends list_Scope0.list
              /*
                  -- GENERATED --
                  DATE: Thu Nov 12 17:07:34 JST 2015
                  SOURCE: C:/play2-hands-on/app/views/user/list.scala.html
                  HASH: 0b776373efa8add24c422d27135ac729c81208a9
                  MATRIX: 564->20|695->56|726->86|754->89|775->102|814->104|844->108|891->129|905->135|947->157|1266->467|1304->478|1318->483|1331->487|1379->497|1416->507|1466->530|1479->534|1503->537|1563->570|1578->576|1634->611|1664->614|1677->618|1703->623|1758->651|1773->657|1826->701|1865->702|1911->720|2024->802|2066->816|2128->847|2165->857
                  LINES: 20->2|25->2|27->4|28->5|28->5|28->5|30->7|31->8|31->8|31->8|44->21|45->22|45->22|45->22|45->22|46->23|47->24|47->24|47->24|48->25|48->25|48->25|48->25|48->25|48->25|49->26|49->26|49->26|49->26|50->27|51->28|52->29|54->31|55->32
                  -- GENERATED --
              */
          