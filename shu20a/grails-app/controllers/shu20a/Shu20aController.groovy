package shu20a

class Shu20aController {

  def pdfRenderingService

  def index() { 
  }

  def aspdf() {
    def data = [:]
    def args = [template: "pdf", model: [data: data], controller:this]

    renderPdf(args)
  }
}
