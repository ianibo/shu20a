package shu20a

class Shu20aController {

  def pdfRenderingService

  def index() { 
  }

  def aspdf() {
    def data = [:]
    def args = [template: "pdf", model: [data: data], controller:this]
    def r = (javax.servlet.http.HttpServletResponse) response

    pdfRenderingService.render(args,r);
  }
}
