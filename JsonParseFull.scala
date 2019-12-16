package fayiz
import scala.util.parsing.json.JSON

object JsonParseFull {
  def main(args: Array[String]){
    var inputJson = """{"Name" : "Fayiz", "Age" : "35", "Colleagues":["Anshar","Jihad"], "Address":{"Street":"Ras Al Khor","city":"Dubai"}}"""
    
    JSON.parseFull(inputJson) match{
      case Some(myJson) => {
        for(x<- myJson.asInstanceOf[Map[String, Any]].keys){
          if(myJson.asInstanceOf[Map[String, Any]](x).isInstanceOf[String]){
            println(x + " : " + myJson.asInstanceOf[Map[String, Any]](x).toString)
          }else{
            if(myJson.asInstanceOf[Map[String, Any]](x).isInstanceOf[List[Any]]){
              for(y <- myJson.asInstanceOf[Map[String, Any]](x).asInstanceOf[List[Any]]){
                println(x + " : " + y.toString)  
              }
            }else{
              for(y <- myJson.asInstanceOf[Map[String,Any]](x).asInstanceOf[Map[String,Any]].keys){
						    println(x + " : " + y.toString + " : " + myJson.asInstanceOf[Map[String,Any]](x).asInstanceOf[Map[String,Any]](y).toString)
					    }
            }
          }
        }
        
      }case None => {
        println("Invalid JSON")
      }
    }
  }
}


