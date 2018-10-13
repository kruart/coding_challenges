package algorithms.DesignerPDFViewer

// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
object DesignerPDFViewerSc {
  def designerPdfViewer(h: Array[Int], word: String): Int = {
    word.toArray.map(ch => h(ch - 'a')).max * word.length
  }

  def main(args: Array[String]) {
    val result1 = designerPdfViewer(Array(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5), "abc")
    val result2 = designerPdfViewer(Array(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7), "zaba")
    println(result1) //9
    println(result2) //28
  }
}
