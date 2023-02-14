package com.example.loadapp

data class FileDownloaded (var downloadID: Long = 0,
                           var selectedGitHubRepository: String? = null,
                           var selectedGitHubFileName: String? = null)