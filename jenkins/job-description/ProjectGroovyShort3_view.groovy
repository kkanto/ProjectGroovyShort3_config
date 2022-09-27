 
listView('ProjectGroovyShort3 Jobs') {
    description('ProjectGroovyShort3 Jobs')
    jobs {
        regex('ProjectGroovyShort3_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
