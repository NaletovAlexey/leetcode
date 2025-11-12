# Должен лежать в папке пользователя (.bash_profile - создается после первого запуска автоматически)
# Запуск SSH-агента, если он еще не запущен
if [ -z "$SSH_AUTH_SOCK" ]; then
    eval $(ssh-agent -s)
fi

cd /d/Work/algorithms_leetcode/leetcode
# Путь к сертификату (private)
ssh-add /c/Users/Tewris/.ssh/github_rsa_naletov.txt

