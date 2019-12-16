package fayiz
import scala.util.parsing.json.JSON

object JsonParseFull {
  def main(args: Array[String]){
    var inputJson = """{"Name" : "Srikant", "Age" : "20", "Colleagues":["Anant","Prabhakaran"], "Address":{"plotno":"D2","city":"Gurgaon"}}"""
    
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


