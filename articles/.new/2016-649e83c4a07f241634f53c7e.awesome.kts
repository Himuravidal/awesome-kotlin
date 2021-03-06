
import link.kotlin.scripts.dsl.Article
import link.kotlin.scripts.dsl.LinkType.*
import link.kotlin.scripts.dsl.LanguageCodes.*
import java.time.LocalDate

// language=Markdown
val body = """

"""

Article(
  title = "Implementing Android App Shortcuts",
  url = "https://medium.com/@andreworobator/implementing-android-app-shortcuts-74feb524959b#.vrst29h9p",
  categories = listOf(
    "Kotlin",
    "Android"
  ),
  type = article,
  lang = EN,
  author = "Andrew Orobator",
  date = LocalDate.of(2016, 12, 19),
  body = body
)
