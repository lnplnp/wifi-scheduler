git filter-branch --commit-filter '
        if [ "$GIT_AUTHOR_EMAIL" = "mpayet@ceritek.com" ];
        then
                GIT_AUTHOR_NAME="Manuel PAYET";
                GIT_AUTHOR_EMAIL="manuelpayet@gmail.com";
                git commit-tree "$@";
        else
                git commit-tree "$@";
        fi' HEAD