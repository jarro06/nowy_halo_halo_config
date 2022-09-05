 
listView('nowy_halo_halo Jobs') {
    description('nowy_halo_halo Jobs')
    jobs {
        regex('nowy_halo_halo_.+')
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
