
package views.html.user

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edit_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class edit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[controllers.UserController.UserForm],Seq[models.Tables.CompaniesRow],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[controllers.UserController.UserForm], companies: Seq[models.Tables.CompaniesRow])(implicit messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.128*/("""

"""),format.raw/*3.29*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("ユーザ作成")/*6.15*/ {_display_(Seq[Any](format.raw/*6.17*/("""

"""),format.raw/*8.32*/("""
"""),_display_(/*9.2*/form(userForm("id").value.map(x => routes.UserController.update).getOrElse(routes.UserController.create), 'class -> "container", 'role -> "form")/*9.147*/ {_display_(Seq[Any](format.raw/*9.149*/("""
"""),format.raw/*10.1*/("""<fieldset>
    <div class="form-group">
        """),_display_(/*12.10*/inputText(userForm("name"), '_label -> "名前")),format.raw/*12.54*/("""
    """),format.raw/*13.5*/("""</div>
    <div class="form-group">
        """),_display_(/*15.10*/select(userForm("companyId"), companies.map(x => x.id.toString -> x.name).toSeq, '_label -> "会社", '_default -> "-- 会社名を選択してください --")),format.raw/*15.142*/("""
    """),format.raw/*16.5*/("""</div>
    """),format.raw/*17.38*/("""
    """),_display_(/*18.6*/userForm("id")/*18.20*/.value.map/*18.30*/ { value =>_display_(Seq[Any](format.raw/*18.41*/("""
    """),format.raw/*19.5*/("""<input type="hidden" name="id" value=""""),_display_(/*19.44*/value),format.raw/*19.49*/("""" />
    """)))}),format.raw/*20.6*/("""
    """),format.raw/*21.5*/("""<div>
        <input type="submit" value="保存" class="btn btn-success">
    </div>
</fieldset>
""")))}),format.raw/*25.2*/("""

""")))}))
      }
    }
  }

  def render(userForm:Form[controllers.UserController.UserForm],companies:Seq[models.Tables.CompaniesRow],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm,companies)(messages)

  def f:((Form[controllers.UserController.UserForm],Seq[models.Tables.CompaniesRow]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm,companies) => (messages) => apply(userForm,companies)(messages)

  def ref: this.type = this

}


}

/**/
object edit extends edit_Scope0.edit
              /*
                  -- GENERATED --
                  DATE: Thu Nov 12 18:06:25 JST 2015
                  SOURCE: C:/play2-hands-on/app/views/user/edit.scala.html
                  HASH: 1da7fe861127c300812faa4cb2c00663ee44453d
                  MATRIX: 606->1|843->127|874->159|902->179|930->182|951->195|990->197|1021->232|1049->235|1203->380|1243->382|1272->384|1350->435|1415->479|1448->485|1522->532|1676->664|1709->670|1749->715|1782->722|1805->736|1824->746|1873->757|1906->763|1972->802|1998->807|2039->818|2072->824|2201->923
                  LINES: 20->1|25->1|27->3|28->5|29->6|29->6|29->6|31->8|32->9|32->9|32->9|33->10|35->12|35->12|36->13|38->15|38->15|39->16|40->17|41->18|41->18|41->18|41->18|42->19|42->19|42->19|43->20|44->21|48->25
                  -- GENERATED --
              */
          