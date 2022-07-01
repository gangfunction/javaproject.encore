module.exports = {
    darkMode: 'class',
    content: ['./src/**/*.tsx', './public/index.html','./src/*.tsx'],
    theme: {
      container:{
        center: true,
        padding: {
          DEFAULT: '1rem',
          sm: '2rem',
          lg: '4rem',
          xl: '5rem',
          '2xl': '6rem',
        },
      },
    },
    variants:{
    extend: {},
    },
    plugins: [],
  }