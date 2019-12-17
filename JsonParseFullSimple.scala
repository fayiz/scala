package fayiz
import scala.util.parsing.json.JSON

object JsonParseFullSimple {
  def main(args: Array[String]){
    var inputJson = """{"Name" : "Fayiz", "Age" : "35", "Colleagues":["Anshar","Jihad"], "Address":{"Street":"Ras Al Khor","City":"Dubai"}}"""
    
    JSON.parseFull(inputJson) match{
      case Some(myJson) => {
        var mapJson = myJson.asInstanceOf[Map[String, Any]]
        for(k <- mapJson.keys){
          println(k + ": " + mapJson(k))
        }
      }case None => {
        println("Invalid JSON")
      }
    }
  }
}


